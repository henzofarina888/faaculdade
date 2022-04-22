import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner Pizza = new Scanner (System.in);
    float V;
    int op;
    System.out.print("Digite o valor da compra: ");
    V = Pizza.nextFloat();
    System.out.println("\nMENU");
    System.out.println("1 - à vista com 10% de desconto");
    System.out.println("2 - cartão crédito com 5% de desconto");
    System.out.println("3 - em 2 vezes sem juros");
    System.out.println("4 - em 3 vezes com 10% de juros");
    System.out.print("Digite a forma de pagamento <1/2/3/4>: ");
    op = Pizza.nextInt();

    switch (op)
    {
       case 1: System.out.printf ("Pagará à vista com 10%% de desconto: %.2f reais",(V*0.90)); break;
       case 2: System.out.printf ("Pagará no crédito com 5%% de desconto: %.2f reais",(V*0.95)); break;
       case 3: System.out.printf ("Pagará 2 parcelas de: %.2f reais",(V/2)); break;
       case 4: System.out.printf ("Pagará 3 parcelas de: %.2f reais",(V*1.10/3)); break;
       default: System.out.println("Forma de pagamento inválida");
    }
 }
}