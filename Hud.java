import java.util.Scanner;
public class Hud {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        byte choice = scanner.nextByte();
        System.out.println("""
                Qual operação você ira fazer?
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - sair
                
                Digite a opção desejada:
                """);
        switch (choice) {
            case (choice == 1):
                
                break;
            default:
                throw new AssertionError();
        }
    }

}