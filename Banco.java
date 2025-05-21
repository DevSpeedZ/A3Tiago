import java.util.List;
import java.util.Scanner;

class Banco {
    private Scanner scanner;

    public Banco(Scanner scanner) {
        this.scanner = scanner;
    }

    public void verSaldo(User usuario) {
        if (usuario == null) {
            System.out.println("Nenhum usuário está logado. \n");
            return;
        }
        System.out.printf("Saldo atual: R$ %.2f%n \n", usuario.getSaldo());
    }

    public void transferirSaldo(User remetente, List<User> usuarios) {
        if (remetente == null) {
            System.out.println("Nenhum usuário está logado.");
            return;
        }

        System.out.print("Digite o nome do email destino: ");
        String destinoEmail = scanner.nextLine();

        User destino = null;
        for (User u : usuarios) {
            if (u.getEmail().equals(destinoEmail)) {
                destino = u;
                break;
            }
        }

        if (destino == null) {
            System.out.println("Usuário destino não encontrado.");
            return;
        }

        System.out.print("Digite o valor a transferir: ");
        double valor;
        try {
            valor = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido.");
            return;
        }

        if (valor <= 0) {
            System.out.println("Valor precisa ser maior que zero.");
            return;
        }

        if (remetente.sacar(valor)) {
            destino.depositar(valor);
            System.out.printf("Transferência de R$ %.2f realizada para %s%n \n\n", valor, destino.getEmail());
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
