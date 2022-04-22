import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner ler= new Scanner(System.in);
    System.out.println("Hello world!");
    float n1, n2, n3, med, nr;
    System.out.printf("Primeiro nota:");
    n1= ler.nextFloat();
    System.out.printf("Segunda nota:");
    n2= ler.nextFloat();
    System.out.printf("Terceira nota:");
    n3= ler.nextFloat();

    med=(n1+n2+n3)/3;
    if (med>=7) System.out.printf("aprovado");
    else System.out.printf("Qual a nota de recuperação:");
        nr= ler.nextFloat();
        if (nr>=5) System.out.printf(" aprovado na recuperação");
        else System.out.printf("reprovado");
  }
}