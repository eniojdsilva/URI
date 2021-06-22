import java.util.Locale;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    int cod1, cod2, num1, num2;
    double valor1, valor2, soma;

    cod1 = input.nextInt();
    num1 = input.nextInt();
    valor1 = input.nextDouble();

    cod2 = input.nextInt();
    num2 = input.nextInt();
    valor2 = input.nextDouble();

    soma = (valor1 * num1) + (valor2 * num2);

    System.out.printf("VALOR A PAGAR: R$ %.2f%n", soma);

    input.close();
  }
}
