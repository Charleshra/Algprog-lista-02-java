import java.util.Scanner;

public class CalculosGeometricos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        double raio;
        final double PI = 3.141592;

        System.out.print("Digite a opção (1, 2 ou 3): ");
        opcao = sc.nextInt();

        System.out.print("Digite o raio: ");
        raio = sc.nextDouble();

        switch (opcao) {
            case 1:
                // Perímetro do círculo
                double perimetro = 2 * PI * raio;
                System.out.println("Perímetro do círculo: " + perimetro);
                break;

            case 2:
                // Área do círculo
                double area = PI * Math.pow(raio, 2);
                System.out.println("Área do círculo: " + area);
                break;

            case 3:
                // Volume da esfera
                double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);
                System.out.println("Volume da esfera: " + volume);
                break;

            default:
                // Código inválido
                System.out.println("Erro: código da operação inválido.");
        }

        sc.close();
    }
}