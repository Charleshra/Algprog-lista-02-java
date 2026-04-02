import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Digite o valor de a: ");
        a = sc.nextDouble();

        System.out.print("Digite o valor de b: ");
        b = sc.nextDouble();

        System.out.print("Digite o valor de c: ");
        c = sc.nextDouble();

        // a) Verificação de coeficientes inválidos
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        }
        // b) Equação de primeiro grau
        else if (a == 0 && b != 0) {
            double x = -c / b;
            System.out.println("Essa é uma equação de primeiro grau.");
            System.out.println("Raiz: x = " + x);
        }
        else {
            // Calculando o discriminante (delta)
            double delta = (b * b) - (4 * a * c);

            // c) Delta negativo
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            }
            // d) Delta igual a zero
            else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais.");
                System.out.println("x1 = x2 = " + x);
            }
            // e) Delta maior que zero
            else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Esta equação possui duas raízes reais diferentes.");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        sc.close();
    }
}
