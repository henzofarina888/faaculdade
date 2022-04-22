import java.util.Scanner;
class Main 
{
  
  public static void main(String[] args) 
  {
    Scanner ler= new Scanner(System.in);
    float sal, gasto;
    System.out.println("Qual seu salário:");
    sal= ler.nextFloat();
    System.out.println("Qual o valor gasto no mês:");
    gasto = ler.nextFloat();

    if (gasto<=sal)System.out.println("Gastos no Orçamento.");
    else System.out.println("Orçamento estoura.");
  
  }
}