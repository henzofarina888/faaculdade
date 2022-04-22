#include <stdio.h>

int main(void) 
{
  float n1,n2;
  printf("Qual o primeiro número?");
  scanf("%f",&n1);
  printf("Qual o segundo número?");
  scanf("%f",&n2);

  printf("\nA soma é ------------> %.2f",n1+n2);
  printf("\nA subtração é -------> %.2f",n1-n2);
  printf("\nA multiplicação é ---> %.2f",n1*n2);

if (n2==0) printf("\nNÃO PODEMOS DIVIDIR POR ZERO!");
else  printf("\nA soma é ------------> %.2f",n1/n2);
}