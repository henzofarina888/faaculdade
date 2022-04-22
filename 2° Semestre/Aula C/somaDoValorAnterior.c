#include <stdio.h>
int main(void) 
{
  int N, c, acum;
  acum = 0;

  printf("Digite um número inteiro: ");
  scanf ("%d",&N);

  if (N < 0)  printf ("Número inválido");
  else {
           for (c=0 ; c<=N ; c++)
           {
               acum = acum + c;
               printf ("\n%d",acum);
           } 
            printf ("\nA soma é %d",acum);
       }   
  return 0;
}