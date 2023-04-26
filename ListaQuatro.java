import java.util.Scanner;

public class ListaQuatro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o código da operação (1 - perímetro do círculo, 2 - área do círculo, 3 - volume da esfera): ");
        int operacao = input.nextInt();

        System.out.print("Informe o raio: ");
        double raio = input.nextDouble();

        double pi = 3.141592;

        switch(operacao) {
            case 1:
                double perimetro = 2 * pi * raio;
                System.out.printf("O perímetro do círculo é: %.2f\n", perimetro);
                break;

            case 2:
                double area = pi * Math.pow(raio, 2);
                System.out.printf("A área do círculo é: %.2f\n", area);
                break;

            case 3:
                double volume = (4/3.0) * pi * Math.pow(raio, 3);
                System.out.printf("O volume da esfera é: %.2f\n", volume);
                break;

            default:
                System.out.println("Código da operação inválido.");
                break;
        }
    }
}
