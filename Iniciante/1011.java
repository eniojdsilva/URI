import java.util.Locale;
import java.util.Scanner;
 

class Main{
 
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int r;
        double formula;
        final double pi = 3.14159;

        r = input.nextInt();

        formula = (4.0/3) * pi * Math.pow(r, 3);

        System.out.printf("VOLUME = %.3f%n", formula);
        
        input.close();
    }
 
}