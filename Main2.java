import java.util.*;
import java.lang.*;
class Main {
  public static void main(String[] args) {
  
    
    Scanner scan = new Scanner (System.in);

    System.out.println("Digite o primeiro numero");
    double n1 = scan.nextDouble();
    
    System.out.println("Digite o segundo numero");
    double n2 = scan.nextDouble();

    double potencia = (Math.pow(n1,2)) + (Math.pow(n2,2));

    System.out.println("O valor da conta é: " + potencia);
  }
}