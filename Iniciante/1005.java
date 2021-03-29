import java.util.Scanner;
import java.util.Locale;

class Main {  
  public static void main(String args[]) { 
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);
    
    double a, b, media;
    final double pesoA = 3.5, pesoB = 7.5;
    
    a = input.nextDouble();
    b = input.nextDouble();
    
    media = (((a*pesoA) + (b*pesoB))/(pesoA + pesoB));

  System.out.printf("MEDIA = %.5f%n", media);
    input.close();
  } 
}
