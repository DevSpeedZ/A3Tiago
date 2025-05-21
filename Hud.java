import java.util.Scanner;
public class Hud {
    private Scanner scanner;
    private Banco banco;
    private Login login;

    public Hud(Scanner scanner, Banco banco, Login login){
        this.scanner = scanner;
        this.banco = banco;
        this.login = login;

    }

    public void menu(){
        while (login.getUsuarioLogado() != null) {
            System.out.println("""
                Qual operação você ira fazer?
                1 - Consultar saldos
                2 - Depositar valor
                3 - Transferir valor
                4 - sair
                Digite a opção desejada:
                """);
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1" -> {
                        banco.verSaldo(login.getUsuarioLogado());
                    }
                    case "2" -> {
                        System.out.println("Digite o valor a depositar: ");
                        Double valor = scanner.nextDouble();
                        scanner.nextLine();
                        if(valor >= 0){
                            login.getUsuarioLogado().depositar(valor); //mexer no depositar
                            System.out.printf("R$ %.2f foram depositados \n\n", valor);
                        }
                    }
                    case "3" -> {
                        banco.transferirSaldo(login.getUsuarioLogado(), login.getUsuarios());
                    }
                    case "4" -> {
                        System.out.println("saindo da conta...");
                        login.logOff();  
                        break; 

                    }
                    default -> System.out.println("opção invalida");
                }
         }
    }
}