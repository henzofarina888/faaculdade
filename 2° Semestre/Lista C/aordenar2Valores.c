#include <stdio.h>

int main(void) 
{
  int n1, n2;
  printf("digite um número:\n");
  scanf("%d",&n1);
  printf("digite outro número:\n");
  scanf("%d",&n2);

  if (n1==n2) printf("Eles são iguais.");
  else if (n1>n2) printf("A ordem é %d %d",n1,n2);
       else printf("A ordem é %d %d",n2,n1);

  return 0;
}