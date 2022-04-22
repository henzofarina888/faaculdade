import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner ler= new Scanner (System.in);
    
    
    float n1,n2,s,s1,m,d;
    System.out.print("Digite o primeiro número:");
    n1 = ler.nextFloat();
    System.out.print("Digite o segundo número:");
    n2 = ler.nextFloat();

    s=n1+n2;
    s1=n1-n2;
    m=n1*n2;
    d=n1/n2;

    System.out.println("A soma é " + s);
    System.out.println("A subtração é " + s1);
    System.out.println("A multiplicação é " + m);
    System.out.println("A divisão é " + d);
  }
}