import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        Float saldo;

        try (Scanner leitura = new Scanner(System.in)) {
            System.out.println("Por favor, digite o Nome do Cliente:");
            nomeCliente= leitura.next();

            System.out.println("Por favor, digite o número da Agência:");
            agencia = leitura.next();

            System.out.println("Por favor, digite o número da Conta:");
            numero = leitura.nextInt();

            System.out.println("Por favor, digite o saldo:");
            saldo = leitura.nextFloat();
        }
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");

    }
}
