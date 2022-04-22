import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    int n1,resul;
    Scanner ler= new Scanner(System.in);
    System.out.println("digite um número:");
    n1= ler.nextInt();
    resul = n1%2;
    if (resul==0) System.out.println("Número Par");
    else System.out.println("Número Ímpar");
  }
}