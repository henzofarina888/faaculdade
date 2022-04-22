import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    float sal;
    Scanner ler= new Scanner (System.in);
    System.out.println("Qual o seu salário?");
    sal = ler.nextFloat();

    if (sal >= 3000) System.out.println("Você tera que pagar o impostono valor de:"+ (sal * 0.10));
    else System.out.print("Não tera que pagar o imposto");
  }
}