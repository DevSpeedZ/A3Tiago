import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Login {
    private List<User> usuarios;
    private Scanner scanner;

    public Login(Scanner scanner){
        usuarios = new ArrayList<>();
        this.scanner = scanner;
    }

    
    public void register(){
        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        // Verifica se já existe um usuário com esse nome
        for (User u : usuarios) {
            if (u.getEmail().equals(email)) {
                System.out.println("Usuário já registrado.");
                return;
            }
        }
        usuarios.add(new User(email, senha));
        System.out.println("Usuário registrado com sucesso.");
    }

    public boolean login() {
        System.out.println("Digite seu usuario: ");
        String email = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        for (User u : usuarios) {
            if (u.getEmail().equals(email) && u.getSenha().equals(senha)) {
                System.out.println("Autenticação bem-sucedida!");
                u.isActive = !u.isActive;
                System.out.println(u.isActive);
                return true;
            }
        }
        System.out.println("Usuário ou senha incorretos.");
        return false;
    }

    
    public void hud(){
        Login login = new Login(scanner);
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
                    break;
                }
                case "2" -> {
                    if(login.login()){
                        return;
                    }
                    
                }
                default -> System.out.println("opção invalida");
            }
                
        }
    }

}