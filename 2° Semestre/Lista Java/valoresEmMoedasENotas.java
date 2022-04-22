import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner ler= new Scanner(System.in);
    int mo, m100i, m100r, m50i, m50r, m10i, m10r, m5i, m5r, m1i, m1r;
    System.out.printf("Olá, digite o valor de moedas:");
    mo= ler.nextInt();

    m100i= mo/100;
    m100r= mo%100;
    m50i= m100r/50;
    m50r= m100r%50;
    m10i= m50r/10;
    m10r= m50r%10;
    m5i= m10r/5;
    m5r= m10r%5;
    m1i= m5r/1;
    m1r= m5r%1;

    System.out.printf("\nmoeda(s) de M$ 100 : %d",m100i);
    System.out.printf("\nmoeda(s) de M$ 50 : %d",m50i);
    System.out.printf("\nmoeda(s) de M$ 10 : %d",m10i);
    System.out.printf("\nmoeda(s) de M$ 5 : %d",m5i);
    System.out.printf("\nmoeda(s) de M$ 1 : %d",m1i);
  }
}