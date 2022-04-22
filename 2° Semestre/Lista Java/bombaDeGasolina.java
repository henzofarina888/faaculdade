import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner ler= new Scanner(System.in);
    char tipo;
    float litro;
    System.out.printf("Qual o combustível? (A para álcool e G para gasolina): ");
    tipo= ler.nextLine().charAt(0);
    System.out.printf("Quantos litros vai ser? ");
    litro = ler.nextFloat();
    if (tipo=='A')
      {
        if (litro<=20) System.out.println("O valor a ser pago será: R$"+ litro*(3.9-3.9*0.03));
        else if (litro>20) System.out.println("O valor a ser pago será: R$"+ litro*(3.9-3.9*0.05));
      }  
    else if (tipo=='G')
      {
        if (litro<=20) System.out.println("O valor a ser pago será: R$"+ litro*(5.3-5.3*0.04));
        else if (litro>20) System.out.println("O valor a ser pago será: R$"+ litro*(5.3-5.3*0.06));
      }
  }
}