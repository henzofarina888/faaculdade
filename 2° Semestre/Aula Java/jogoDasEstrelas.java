import java.util.Random;
import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Random aleatorio = new Random();
    Scanner ler = new Scanner(System.in);
    int tentativa, computador, cont=0, teste=0, comp; 
          
     System.out.print ("* JOGO DAS ESTRELAS *\n");
    computador = aleatorio.nextInt(96 )+32;
    System.out.print ("\n"+ computador);
    tentativa = 111111; 
        while(tentativa != computador)
        { 
            cont++; 
            System.out.print("\nDigite um número: ");
            tentativa = ler.nextInt();
            comp = tentativa - computador;
              if(comp >= 64 || comp <= -64) {System.out.print("*");}
                else if(comp >= 32 || comp <= -32) {System.out.print("**");}
                  else if(comp >= 16 || comp <= -16) {System.out.print("*");}
                    else if(comp >= 8 || comp <= -8) {System.out.print("**");}
                      else if(comp >= 4 || comp <= -4) {System.out.print("*");}
                        else if(comp >= 2 || comp<= -2) {System.out.print("**");}
                          else if(comp == 1 || comp <= -1) {System.out.print("*");}
                            else System.out.print("\n** Parabéns você adivinhou o número! **\n");
        }
                                 System.out.print("\n* Você precisou de " + cont +" tentativas para adivinhar! *\n");
                                 teste = 1;             
  }
}