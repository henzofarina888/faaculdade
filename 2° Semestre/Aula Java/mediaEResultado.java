
import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    float n1, n2, n3, rec, med;
    Scanner ler = new Scanner (System.in);
    System.out.println("qual a primeira nota?");
    n1= ler.nextFloat();
    System.out.println("qual a segunda nota?");
    n2= ler.nextFloat();
    System.out.println("qual a terceira nota?");
    n3= ler.nextFloat();

    med= (n1+n2+n3)/3;

    if (med>=7) System.out.println("Aprovado");
    else {
          System.out.println("qual sua nota da recupeção?");
          rec= ler.nextFloat();
          if(rec >= 5) System.out.println("Aprovado na Recuperação");
          else        System.out.println("Reprovado na REcuperação");
         }
  }
}