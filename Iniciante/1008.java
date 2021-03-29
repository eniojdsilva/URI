import java.util.Scanner;
import java.util.Locale;

class Main {  
  public static void main(String args[]) { 
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);
    
    int numeroFuncionario;
    double horasTrabalhadas, valorPagoHr, salario;

    numeroFuncionario = input.nextInt();
    horasTrabalhadas = input.nextDouble();
    valorPagoHr = input.nextDouble();
    
    salario = horasTrabalhadas * valorPagoHr;

    System.out.println("NUMBER = " + numeroFuncionario);
    System.out.printf("SALARY = U$ %.2f%n", salario);

    input.close();
  } 
}
