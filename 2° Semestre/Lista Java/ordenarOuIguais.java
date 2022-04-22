import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner ler = new Scanner (System.in);
    int n1, n2;
    System.out.println("digite um número:");
    n1 =ler.nextInt();
    System.out.println("digite outro número:");
    n2 =ler.nextInt();

    if (n1==n2) System.out.printf("Eles são iguais.");
  else if (n1>n2) System.out.printf("A ordem é %d %d",n1,n2);
       else System.out.printf("A ordem é %d %d",n2,n1);

  }
}