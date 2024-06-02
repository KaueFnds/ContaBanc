import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta ! ");
        int numero = scanner.nextInt() ;

        System.out.println("Por favor, digite o número da Agência ! ");
        String agencia = scanner.next() ;

        System.out.println("Por favor, digite seu Nome ! ");
        String nomeCliente = scanner.next() ;

        System.out.println("Por favor, digite seu Saldo ! ");
        double saldo = scanner.nextDouble() ;

        System.out.println("Olá " +  nomeCliente + ", obrigado por criar uma conta em");
        System.out.println("nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu");
        System.out.println("saldo R$" + saldo + " já está disponivel para saque.");
    }
}
