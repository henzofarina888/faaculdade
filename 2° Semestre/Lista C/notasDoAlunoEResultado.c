#include <stdio.h>

int main(void) 
{
  float n1, n2, n3, med, nr;
  printf("Primeiro nota:");
  scanf("%f",&n1);
  printf("Segunda nota:");
  scanf("%f",&n2);
  printf("Terceira nota:");
  scanf("%f",&n3);

  med=(n1+n2+n3)/3;
  if (med>=7) printf("aprovado");
  else printf("Qual a nota de recuperação:");
       scanf("%f",&nr);
      if (nr>=5) printf(" aprovado na recuperação");
      else printf("reprovado");
  return 0;
}