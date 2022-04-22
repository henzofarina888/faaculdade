import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner ler= new Scanner (System.in);
    int mes;
    System.out.printf("digite um número inteiro de 1 a 12:");
    mes= ler.nextInt();

    switch (mes)
    {
      case 1: System.out.printf("JANEIRO");break;
      case 2: System.out.printf("FEVEREIRO");break;
      case 3: System.out.printf("MARÇO");break;
      case 4: System.out.printf("ABRIL");break;
      case 5: System.out.printf("MAIO");break;
      case 6: System.out.printf("JUNHO");break;
      case 7: System.out.printf("JULHO");break;
      case 8: System.out.printf("AGOSTO");break;
      case 9: System.out.printf("SETEMBRO");break;
      case 10: System.out.printf("OUTUBRO");break;
      case 11: System.out.printf("NOVEMBRO");break;
      case 12: System.out.printf("DEZEMBRO");break;
      default: System.out.printf("Mês inválido");break;
    }
  }
}