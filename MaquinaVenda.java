import java.util.Scanner;

public class MaquinaVenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorCompra, valorPago;

        System.out.print("Digite o valor da compra: R$ ");
        valorCompra = sc.nextDouble();

        System.out.print("Digite o valor pago: R$ ");
        valorPago = sc.nextDouble();

        // Verifica se o valor é suficiente
        if (valorPago < valorCompra) {
            System.out.println("Valor insuficiente para realizar a compra.");
        } else {
            double troco = valorPago - valorCompra;
            System.out.println("Troco: R$ " + troco);

            // Convertendo para inteiro (evita problema com casas decimais)
            int resto = (int) troco;

            int n50 = resto / 50;
            resto = resto % 50;

            int n20 = resto / 20;
            resto = resto % 20;

            int n10 = resto / 10;
            resto = resto % 10;

            int n5 = resto / 5;
            resto = resto % 5;

            int n2 = resto / 2;
            resto = resto % 2;

            int n1 = resto / 1;

            System.out.println("Notas para o troco:");
            if (n50 > 0) System.out.println("R$50: " + n50);
            if (n20 > 0) System.out.println("R$20: " + n20);
            if (n10 > 0) System.out.println("R$10: " + n10);
            if (n5 > 0) System.out.println("R$5: " + n5);
            if (n2 > 0) System.out.println("R$2: " + n2);
            if (n1 > 0) System.out.println("R$1: " + n1);
        }

        sc.close();
    }
}