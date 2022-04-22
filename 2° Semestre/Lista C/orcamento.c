#include <stdio.h>

int main(void) 
{
  float sal, gasto;
  printf("Qual seu salário:\n");
  scanf("%f",&sal);
  printf("Qual o valor gasto no mês:\n");
  scanf("%f",&gasto);

  if (gasto<=sal)printf("Gastos no Orçamento.");
  else printf("Orçamento estoura.");
  
  return 0;
}