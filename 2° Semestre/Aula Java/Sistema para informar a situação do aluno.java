
import java.util.Scanner;


class Main 
{
  public static void main(String[] args) 
  {

    float n1, n2, med;
    Scanner notas = new Scanner (System.in);

    System.out.println("Sistema para informar a situação do aluno");
    System.out.print("Digite a primeira nota:");
    n1=notas.nextFloat();
    System.out.print("Digite a segunda nota:");
    n2=notas.nextFloat();

    med=(n1+n2)/2;

    if(med>=6) System.out.print("Parabéns, você esta APROVADO!");
    else System.out.print("Poxa, você esta REPROVADO!");




  }
}