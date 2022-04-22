
import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
    Scanner ler= new Scanner(System.in);
    int q, t, i, v;
    float m=0;
    System.out.println("maior Q");
    q= ler.nextInt();
    if (q<=0) System.out.println("valor invalido");
    else{
      t=0;
      i=1;
      while (i<=q)
      {
        System.out.print("digite um numero variavel v>>");
        v= ler.nextInt();
        t= t+v;
        i++;
      }
      m=t/q;
    }
    System.out.println(m);
  }
}