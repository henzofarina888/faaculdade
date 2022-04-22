import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner ler= new Scanner(System.in);
    float peso, altura, imc;
    System.out.println("Qual a sua altura:");
    altura = ler.nextFloat();
    System.out.println("Qual a sua peso:");
    peso = ler.nextFloat();

    imc=peso/(altura*altura);

    if (imc<=18.5) System.out.printf("Magro");
    else if (imc<=25) System.out.printf("Normal");
        else if (imc<=30) System.out.printf("Sobrepeso");
              else System.out.printf("Obeso");
  }
}