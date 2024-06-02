import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome!");
        nomeCliente = scanner.nextLine();

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Por favor, digite o saldo!");
                saldo = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número decimal válido.");
                scanner.next();
            }
        }

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}

