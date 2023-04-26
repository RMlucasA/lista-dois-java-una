import java.util.Scanner;

public class ListaDois {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      int valorCompra, valorPago, troco, notas50, notas20, notas10, notas5, notas2, notas1;

      // Leitura do valor da compra e do valor pago
      System.out.println("Digite o valor da compra:");
      valorCompra = input.nextInt();

      System.out.println("Digite o valor pago:");
      valorPago = input.nextInt();

      // Verifica se o valor pago é suficiente para realizar a compra
      if (valorPago < valorCompra) {
         System.out.println("Valor insuficiente para realizar a compra.");
         return;
      }

      // Calcula o troco
      troco = valorPago - valorCompra;

      // Calcula o número de notas de cada tipo que deve ser dado de troco
      notas50 = troco / 50;
      troco %= 50;

      notas20 = troco / 20;
      troco %= 20;

      notas10 = troco / 10;
      troco %= 10;

      notas5 = troco / 5;
      troco %= 5;

      notas2 = troco / 2;
      troco %= 2;

      notas1 = troco;

      // Exibe o número de notas de cada tipo que deve ser dado de troco
      System.out.println("Notas de R$50: " + notas50);
      System.out.println("Notas de R$20: " + notas20);
      System.out.println("Notas de R$10: " + notas10);
      System.out.println("Notas de R$5: " + notas5);
      System.out.println("Notas de R$2: " + notas2);
      System.out.println("Notas de R$1: " + notas1);

      input.close();
   }
}