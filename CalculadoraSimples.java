import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, resultado;
        char operacao;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /, ^): ");
        operacao = sc.next().charAt(0);

        switch (operacao) {
            case '+':
                resultado = n1 + n2;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                resultado = n1 - n2;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = n1 * n2;
                System.out.println("Resultado: " + resultado);
                break;

            case '/':
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero.");
                }
                break;

            case '^':
                resultado = Math.pow(n1, n2);
                System.out.println("Resultado: " + resultado);
                break;

            default:
                System.out.println("Erro: símbolo da operação inválido.");
        }

        sc.close();
    }
}
