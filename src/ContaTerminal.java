import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        int Agencia = scanner.nextInt();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu saldo: ");
        Double Saldo = scanner.nextDouble();


        System.out.println("");



    }
}