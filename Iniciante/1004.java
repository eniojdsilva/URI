import java.util.Scanner;
import java.util.Locale;

class Main {  
  public static void main(String args[]) { 
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);
    
    int a, b, prod;

    a = input.nextInt();
    b = input.nextInt();

    prod = a*b;

    System.out.println("PROD = " + prod);
    input.close();
  } 
}
