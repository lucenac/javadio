import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o número da conta: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o número da agência: ");
        String agencia = sc.nextLine();
        System.out.print("Digite o seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, num, saldo);
    }
}
