import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
      int A, B;
      Scanner ler = new Scanner (System.in);
      System.out.println("\n\nSistema para mostrar em ordem CRSCENTE");
      System.out.print("Digite o 1º número: ");
      A = ler.nextInt();
      System.out.print("Digite o 2º número: ");
      B = ler.nextInt();

      if (A < B)   System.out.println("Ordem crescente --> " + A + " e " + B);
      else         System.out.println("Ordem crescente --> " + B + " e " + A);
  }
}