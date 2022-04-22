import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner ler= new Scanner (System.in);
    
    
    float n1,n2,m;
    System.out.print("Qual a base:");
    n1 = ler.nextFloat();
    System.out.print("Qual a altura:");
    n2 = ler.nextFloat();

    
    m=n1*n2;
    System.out.println("A Aréa é " + m);
  }
}