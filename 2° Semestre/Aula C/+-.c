#include <stdio.h>

int main(void) 
{
  float n1;
  printf("Qual o primeiro número?");
  scanf("%f",&n1);
  
  if (n1>=0) printf("O número é POSITIVO");
  else printf("O número é negativo");
}