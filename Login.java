import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Login {
    private List<User> usuarios;
    private Scanner scanner;
    private User usuarioLogado = null;

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
        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        for (User u : usuarios) {
            if (u.getEmail().equals(email) && u.validarSenha(senha)) {
                System.out.println("Autenticação bem-sucedida! \n\n");
                this.usuarioLogado = u;
                return true;
            }
        }
        System.out.println("Usuário ou senha incorretos. \n\n");
        return false;
    }

    
    public void hud(){
        while (true) { 
            
            System.out.println("""
                Olã seja bem vindo ao Sistema bancario Brasisco!
                Qual operação gostaria de fazer?
                
                1 - Registrar
                2 - Logar
                3 - Sair
                
                """);
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> {
                    this.register();
                    break;
                }
                case "2" -> {
                    if(this.login()){
                        return;
                    }
                    
                }
                case "3" ->{
                    System.out.println("Obrigado por utilizar nossos serviços, até a próxima!!!");
                    System.exit(0);
                }
                default -> System.out.println("opção invalida \n\n");
            } 
        }
    }
    
    public User getUsuarioLogado() {
        return usuarioLogado;
    }
    public void logOff(){
        this.usuarioLogado = null;
    }
    public List<User> getUsuarios() {
        return usuarios;
    }

}