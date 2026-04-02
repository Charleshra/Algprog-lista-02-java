import java.util.Scanner;

public class TresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();

        System.out.print("Digite o terceiro número: ");
        n3 = sc.nextDouble();

        // Maior número
        double maior = n1;
        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }

        // Menor número
        double menor = n1;
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }

        // Média
        double media = (n1 + n2 + n3) / 3;

        // Resultados
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média: " + media);

        sc.close();
    }
}