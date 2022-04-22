#include <stdio.h>

int main(void) 
{
  float n1, n2,med;
  printf("Qual sua primeira nota?");
  scanf("%f",&n1);
  printf("Qual sua segunda  nota?");
  scanf("%f",&n2);

  med= (n1+n2)/2;

  printf("A média é %.2f",med);
  
  if(med>=6) printf("\nParabéns, voce foi APROVADO");
  else       printf("\nParabéns, voce foi REPROVADO");
 



  return 0;
}