import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Login {
    private List<User> usuarios;

    public Login(){
        usuarios = new ArrayList<>();
    }

    
    public void register(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu usuario: ");
        String username = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        // Verifica se já existe um usuário com esse nome
        for (User u : usuarios) {
            if (u.getUsername().equals(username)) {
                System.out.println("Usuário já registrado.");
                return;
            }
        }
        usuarios.add(new User(username, senha));
        System.out.println("Usuário registrado com sucesso.");
        scanner.close();
    }

    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu usuario: ");
        String username = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        scanner.close();
        for (User u : usuarios) {
            if (u.getUsername().equals(username) && u.getSenha().equals(senha)) {
                System.out.println("Autenticação bem-sucedida!");
                return true;
            }
        }
        System.out.println("Usuário ou senha incorretos.");
        return false;
    }

    
    public static void Hud(){
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();
        while (true) { 
            
            System.out.println("""
                Olã seja bem vindo ao Sistema bancario Brasisco!
                Qual operação gostaria de fazer?
                
                1 - Registrar
                2 - Logar
                
                """);
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> {
                    login.register();
                    scanner.close();
                    break;
                }
                case "2" -> {
                    login.login();
                    scanner.close();
                    break;
                }
                default -> System.out.println("opção invalida");
            }
                
        }
    }

}