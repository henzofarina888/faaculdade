import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    int A, B;
    Scanner diferentes = new Scanner (System.in);
    System.out.println("Sistema para analisar dois números");
    System.out.print("digite o primeiro número:");
    A= diferentes.nextInt();
    System.out.print("digite o segundo número:");
    B= diferentes.nextInt();

    if(A==B) System.out.print("os números IGUAIS.");
    else System.out.print(" os números DIFENTES.");
  }
}