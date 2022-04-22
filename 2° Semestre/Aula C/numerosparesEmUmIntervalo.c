#include <stdio.h>
int main(void) 
{
  int N1, N2, cont;
  char op = 's';   // forçar a entrada no while

 while (op=='s' || op=='S')
 {
   printf ("Digite o número INICIAL do intervalo..: ");
   scanf ("%d",&N1);
   printf ("Digite o número FINAL do intervalo....: ");
   scanf ("%d",&N2);

   if (N1 > N2) printf ("Não existe número, neste intervalo, para exibir na tela!!!");

   else for (cont=N1 ; cont<=N2 ; cont++)
          if (cont % 2 == 0 ) printf ("\n%d",cont); 


   printf ("\nDeseja continuar <S/N>: ");
   scanf ("%s",&op);               
 }
  return 0;
}