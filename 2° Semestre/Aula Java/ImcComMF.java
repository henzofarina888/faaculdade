import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    char sexo;
    float alt, peso;
    Scanner ler = new Scanner (System.in);

    System.out.print("Digite seu sexo <F/M>: ");
    sexo = ler.nextLine().toUpperCase().charAt(0);   
    if ((sexo != 'F') && (sexo != 'M')) System.out.println("Sexo Inválido!!! ");    
    else  {
              System.out.print("Digite sua altura: ");
              alt = ler.nextFloat();
              if (sexo == 'F') System.out.printf ("Seu peso ideal é %.2f \n",62.1*alt-44.7);
              else             System.out.printf ("Seu peso ideal é %.2f \n",72.7* alt- 58);
          }
  }
}