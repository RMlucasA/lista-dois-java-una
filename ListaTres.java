import java.util.Scanner;

public class ListaTres {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      double a, b, c, delta, x1, x2;

      // Leitura dos coeficientes da equação
      System.out.println("Digite o valor do coeficiente a:");
      a = input.nextDouble();

      System.out.println("Digite o valor do coeficiente b:");
      b = input.nextDouble();

      System.out.println("Digite o valor do coeficiente c:");
      c = input.nextDouble();

      // Verificação da consistência dos coeficientes
      if (a == 0 && b == 0 && c != 0) {
         System.out.println("Coeficientes informados incorretamente.");
         return;
      }

      if (a == 0 && b != 0) {
         System.out.println("Essa é uma equação de primeiro grau.");
         x1 = -c / b;
         System.out.println("A raiz real da equação é: " + x1);
         return;
      }

      // Cálculo do discriminante
      delta = Math.pow(b, 2) - 4 * a * c;

      // Verificação do valor do discriminante
      if (delta < 0) {
         System.out.println("Esta equação não possui raízes reais.");
         return;
      }

      if (delta == 0) {
         System.out.println("Esta equação possui duas raízes reais iguais.");
         x1 = -b / (2 * a);
         System.out.println("As raízes da equação são: " + x1 + " e " + x1);
         return;
      }

      if (delta > 0) {
         System.out.println("Esta equação possui duas raízes reais diferentes.");
         x1 = (-b + Math.sqrt(delta)) / (2 * a);
         x2 = (-b - Math.sqrt(delta)) / (2 * a);
         System.out.println("As raízes da equação são: " + x1 + " e " + x2);
         return;
      }

      input.close();
   }
}
