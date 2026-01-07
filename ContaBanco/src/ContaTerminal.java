import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da sua Conta: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println(
                "Olá, " + nome +
                        ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                        agencia + ", conta " + numero +
                        " e seu saldo de R$ " + saldo +
                        " já está disponível para saque."
        );
    }
}
