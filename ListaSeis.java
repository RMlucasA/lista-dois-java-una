import java.util.Scanner;
import java.util.Random;

public class ListaSeis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite dois números inteiros:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int maior = Math.max(num1, num2);
        int menor = Math.min(num1, num2);

        int sorteado = random.nextInt(maior - menor + 1) + menor;

        System.out.println("O número sorteado foi: " + sorteado);

        if (sorteado % 2 == 0) {
            System.out.println("Este número é par.");
        } else {
            System.out.println("Este número é ímpar.");
        }

        sc.close();
    }
}
