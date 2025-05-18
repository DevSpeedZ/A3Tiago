import java.util.Scanner;
public class Hud {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        System.out.println("""
                Qual operação você ira fazer?
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - sair
                
                Digite a opção desejada:
                """);
        switch (choice) {
            case "1" -> {
            }
            case "2" -> {
            }
            case "3" -> {
            }
            case "4" -> {
            }
            default -> System.out.println("opção invalida");
        }
        scanner.close();
    }

}