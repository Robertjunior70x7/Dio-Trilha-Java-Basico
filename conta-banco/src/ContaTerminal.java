import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;

        int agencia;

        int numero;

        double saldo = 158.40;

        System.out.println("Seja bem vindo");

        System.out.print("Insira o seu nome:");

        nome = sc.next();

        System.out.println("Insira o número da agencia");

        agencia = sc.nextInt();

        System.out.println("Insira o numero da conta");

        numero = sc.nextInt();

        System.out.println("olá:" + nome + ", obrigado por criar uma conta em nosso banco,sua agencia é:" + agencia
                + "conta:" + numero + "e seu saldo:" + saldo + "ja está disponivel para saque");

    }
}
