import java.util.Scanner;
import java.util.Locale;

class Main {  
  public static void main(String args[]) { 
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);
    
    double a, b, c, media;
    final double pesoA = 2, pesoB = 3, pesoC = 5;
    
    a = input.nextDouble();
    b = input.nextDouble();
    c = input.nextDouble();

    media = (((a*pesoA) + (b*pesoB) + (c*pesoC))/(pesoA + pesoB + pesoC));

  System.out.printf("MEDIA = %.1f%n", media);
    input.close();
  } 
}
