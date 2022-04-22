 import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner ler= new Scanner (System.in);
    
    
    float n1,n2,m;
    System.out.print("Digite um primeiro número:");
    n1 = ler.nextFloat();
    System.out.print("Digite um primeiro número:");
    n2 = ler.nextFloat();

    
    m=(n1+n2)/2;
    System.out.println("A média é " + m);
  }
}