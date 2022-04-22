import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner ler = new Scanner (System.in);
    float sal;
    System.out.println("digite seu salário: ");
    sal = ler.nextFloat();
    if (sal<=2000) System.out.println("seu novo salário: R$"+ sal*1.50);
    else if (sal<=5000) System.out.println("seu novo salário: R$"+ sal*1.20);
         else System.out.println("seu novo salário: R$"+ sal*1.10);
  }
}