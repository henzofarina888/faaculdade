import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner ler= new Scanner(System.in);
    
    int pu, puv;
    System.out.printf("Quantos pontos o time da UNICID fez?");
    pu= ler.nextInt();
    System.out.printf("Quantos pontos o time da universidade visitante fez?");
    puv= ler.nextInt();

    if (pu>puv) System.out.printf("Vitória");
    else if (puv>pu) System.out.printf("Derrota");
        else System.out.printf("Empate");
  }
}