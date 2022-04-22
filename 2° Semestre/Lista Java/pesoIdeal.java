import java.io.IOException;
import java.util.Scanner;
class Main 
{
  
  public static void main(String[] args) throws IOException 
  {
    Scanner ler = new Scanner(System.in);
    char sexo;
    float altura;

    System.out.printf("Informe o sexo (M/F): ");
    sexo = (char)System.in.read();

    System.out.printf("Informe a altura (em metros): ");
    altura = ler.nextFloat();
   
    if ((sexo == 'M') || (sexo == 'm'))
      System.out.printf("Seu peso idela é %f KG",72.7 * altura - 58);
    else System.out.printf("Seu peso idela é %f KG", 62.1 * altura - 44.7);
  }
}