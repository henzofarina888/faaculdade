import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner leitura = new Scanner (System.in);
    float A,B;
    char op;
    System.out.print("Digite o primeiro número: ");
    A = leitura.nextFloat();
    System.out.print("Digite a operação desejada <+ - * />: ");
    op = leitura.next().charAt(0); 
    System.out.print("Digite o segundo número: ");
    B = leitura.nextFloat();
    switch (op) // int ou char
    {
       case '+': System.out.printf ("A soma é %.2f ", A+B); break;
       case '-': System.out.printf ("A subtração é %.2f ", A-B); break;
       case '*': System.out.printf ("A multiplicação é %.2f ", A*B); break;
       case '/':  if (B==0) System.out.println ("Não podemos dividir por ZERO ");
                  else      System.out.printf ("A divisão é %.2f ", A/B); 
                  break;
       default: System.out.println ("Operação inválida!!");
    }
  }
}