import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner ler= new Scanner(System.in);
    
    int nota;
    System.out.printf("Qual a nota?");
    nota = ler.nextInt();

    if (nota<=30) System.out.printf("REGULAR");
    else if (nota<=60) System.out.printf("BOM");
        else if (nota<=90) System.out.printf("MUITO BOM");
              else System.out.printf("ÓTIMO");
  }
}