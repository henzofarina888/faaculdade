#include <stdio.h>

int main(void) 
{
  float peso, altura, imc;
  printf("Qual a sua altura:");
  scanf("%f",&altura);
  printf("Qual a sua peso:");
  scanf("%f",&peso);

  imc=peso/(altura*altura);

  if (imc<=18.5) printf("Magro");
  else if (imc<=25) printf("Normal");
       else if (imc<=30) printf("Sobrepeso");
            else printf("Obeso");
  return 0;
}