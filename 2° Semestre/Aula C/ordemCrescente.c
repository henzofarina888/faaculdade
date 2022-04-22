#include <stdio.h>

int main(void) 
{
  int n1,n2;
  printf("Qual o primeiro número?");
  scanf("%d",&n1);
  printf("Qual o segundo número?");
  scanf("%d",&n2);

  if(n1<=n2) printf("A ordem é %d %d",n1,n2);
  else       printf("A ordem é %d %d", n2, n1);
}