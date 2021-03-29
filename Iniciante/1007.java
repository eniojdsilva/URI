import java.util.Scanner;
import java.util.Locale;

class Main {  
  public static void main(String args[]) { 
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);
    
    int a, b, c, d, diferenca;
    
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();
    d = input.nextInt();
    
    diferenca = (a*b - c*d);


  System.out.println("DIFERENCA = " + diferenca);
    input.close();
  } 
}
