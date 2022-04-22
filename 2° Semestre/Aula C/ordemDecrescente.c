#include <stdio.h>

int main(void) 
{
  int n1,n2;
  printf("Qual o primeiro número?");
  scanf("%d",&n1);
  printf("Qual o segundo número?");
  scanf("%d",&n2);

  if(n1>=n2) printf("O maior número é %d",n1);
  else       printf("O maior número é %d",n2);
}