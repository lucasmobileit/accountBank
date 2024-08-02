import java.util.Scanner;

public class ContaTerminal {
        
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o número da conta: ");
        numero = sc.nextInt();

        System.out.println("Digite a agência: ");
        sc.nextLine();
        agencia = sc.nextLine();


        System.out.println("Digite o nome do Cliente: ");
        nomeCliente = sc.nextLine();

        System.out.println("Digite o saldo da conta: ");
        saldo = sc.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta" +
                " em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu" +
                " saldo " + saldo + " e já está disponível para saque.");

        sc.close();                    
        }      
}
