import java.util.Scanner;
import java.util.Locale;

class Main {  
  public static void main(String args[]) { 
    Locale.setDefault(Locale.US);
    Scanner entrada = new Scanner(System.in);
    
    double area;
    double n = 3.14159;
    double raio;

    raio = entrada.nextDouble();
    
    area = n *(raio*raio);
    System.out.printf("A=%.4f%n",area);

    entrada.close();
  } 
}
