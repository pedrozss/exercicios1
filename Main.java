import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

    System.out.println("Digite dois números");

    float n1 = scan.nextFloat();
    float n2 = scan.nextFloat();

    float produto = n1 * n2;

    System.out.println("O valor do produto é: " + produto);
  }
}