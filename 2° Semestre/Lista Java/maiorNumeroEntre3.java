import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner ler= new Scanner(System.in);
    System.out.println("Hello world!");
    float n1, n2, n3;
    System.out.println("Qual o primeiro número:");
    n1= ler.nextFloat();
    System.out.println("Qual o segundo número:");
    n2= ler.nextFloat();
    System.out.println("Qual o terceiro número:");
    n3= ler.nextFloat();

    if (n1>n2 && n1>n3) System.out.println("O maior número é "+ n1);
    else if (n2>n1 && n2>n3) System.out.println("O maior número é "+ n2);
         else if (n3>n2 && n3>n1) System.out.println("O maior número é "+ n3);
              else if (n1==n2 && n1==n3) System.out.println("O maior número é "+ n1);
  }
}