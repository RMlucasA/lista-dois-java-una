import java.util.Scanner;

public class ListaUm {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      double num1, num2, num3, maior, menor, media;

      System.out.println("Digite o primeiro número:");
      num1 = input.nextDouble();

      System.out.println("Digite o segundo número:");
      num2 = input.nextDouble();

      System.out.println("Digite o terceiro número:");
      num3 = input.nextDouble();

      // Encontrando o maior número
      if (num1 >= num2 && num1 >= num3) {
         maior = num1;
      } else if (num2 >= num1 && num2 >= num3) {
         maior = num2;
      } else {
         maior = num3;
      }

      // Encontrando o menor número
      if (num1 <= num2 && num1 <= num3) {
         menor = num1;
      } else if (num2 <= num1 && num2 <= num3) {
         menor = num2;
      } else {
         menor = num3;
      }

      // Calculando a média aritmética
      media = (num1 + num2 + num3) / 3;

      // Exibindo os resultados
      System.out.println("Maior número: " + maior);
      System.out.println("Menor número: " + menor);
      System.out.println("Média aritmética: " + media);

      input.close();
   }
}  