import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
    Scanner ler= new Scanner (System.in);
    int h1, h2, m2, m1;
    System.out.printf("idade do primeiro homem?");
    h1=ler.nextInt();
    System.out.printf("idade do segundo homem?");
    h2=ler.nextInt();
    System.out.printf("idade do primeira mulher?");
    m1=ler.nextInt();
    System.out.printf("idade do segunda mulher?");
    m2=ler.nextInt();

    if (h1>=h2 && m1>=m2) System.out.printf("A soma da idade é %d anos\n",h1+m2);
    else if (h1>=h2 && m2>=m1) System.out.printf("A soma da idade é %d anos\n",h1+m1);
        else if (h2>=h1 && m1>=m2) System.out.printf("A soma da idade é %d anos\n",h2+m2);
              else if (h2>=h1 && m2>=m1) System.out.printf("A soma da idade é %d anos\n",h2+m1);
    if (h1>=h2 && m1>=m2) System.out.printf("A soma da idade é %d anos",h2+m1);
    else if (h1>=h2 && m2>=m1) System.out.printf("A soma da idade é %d anos",h2+m2);
        else if (h2>=h1 && m1>=m2) System.out.printf("A soma da idade é %d anos",h1+m1);
              else if (h2>=h1 && m2>=m1) System.out.printf("A soma da idade é %d anos",h1+m2);
  }
}