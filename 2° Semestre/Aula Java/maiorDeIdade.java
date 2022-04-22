import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    int idade;
    Scanner ler = new Scanner (System.in);
    System.out.println("qual a sua idade?");
    idade= ler.nextInt();
    if (idade>=18) System.out.println("Você é maior de idade.");
    else System.out.println ("Você é menor de idade.");
  }
}