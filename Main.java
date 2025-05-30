
import java.util.Scanner;
public class Main { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login(scanner);
        Banco banco = new Banco(scanner);
        Hud hud = new Hud(scanner, banco, login);

        while (true) {
            login.hud(); // ← aguarda login bem-sucedido

            hud.menu(); // menu de operações do banco
        }



        
    }
}