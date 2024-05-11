import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Por favor, digite o Nome do cliente!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, informe o saldo!");
        double saldo = scanner.nextDouble();

        // Apresentando informações:
        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia +
                ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
