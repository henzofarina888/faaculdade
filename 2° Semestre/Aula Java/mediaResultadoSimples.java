import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    float n1, n2, med;
    Scanner ler= new Scanner(System.in);
    System.out.println("Diigite a primeira note:");
    n1 = ler.nextFloat();
    System.out.println("Digite a segunda nota:");
    n2= ler.nextFloat();

    med = (n1+n2)/2;

    if (med>=7)      System.out.println("Aprovado");
    else if (med<5) System.out.println("Reprovado");
         else        System.out.println("Exame");
  }
}