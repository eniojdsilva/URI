import java.util.Scanner;
import java.util.Locale;

public class Executar {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double a, b, c, pi = 3.14159, formula;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        formula = (a * c) / 2;
        System.out.printf("TRIANGULO: %.3f%n", formula);
        formula = Math.pow(c, 2) * pi;
        System.out.printf("CIRCULO: %.3f%n", formula);
        formula = ((a + b)*c)/2;
        System.out.printf("TRAPEZIO: %.3f%n", formula);
        formula = b * b;
        System.out.printf("QUADRADO: %.3f%n", formula);
        formula = (a * b);
        System.out.printf("RETANGULO: %.3f%n", formula);
        
        input.close();
    }
}
