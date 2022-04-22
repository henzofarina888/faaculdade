#include <stdio.h>

int main(void) 
{
  int N, c;
  printf("Digite um número:");
  scanf("%d",&N);

  if (N<0) printf("Noumero Inválido");
  else for (c=0; c<=N; c++)
        {
          if (c<10) printf("0%d\t",c);
          else printf("%d\t",c);
        }
  return 0;
}