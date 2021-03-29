import java.util.Scanner;
import java.util.Locale;

class Main {  
  public static void main(String args[]) { 
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);
    
    int a,b, soma;

    a = input.nextInt();
    b = input.nextInt();
    
    soma = a + b;

    System.out.println("SOMA = " + soma);

    input.close();
  } 
}
