import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, vamos lhe ajudar a criar sua conta!");

        System.out.println("Qual o seu nome?");
        String nomeCliente = scanner.nextLine();

        System.out.println("Qual a sua agência (utilize o modelo xxx-x)");
        String agencia = scanner.nextLine();

        System.out.println("Qual o número da sua conta?");
        int numeroConta = scanner.nextInt();

        System.out.println("Qual o seu saldo?");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque";

        System.out.println(mensagem);

    }
}