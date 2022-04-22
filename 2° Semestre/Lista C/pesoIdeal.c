#include <stdio.h>

int main(void) 
{
  char sexo;
  float altura;
  printf("Qual seu sexo?(M/F)");
  scanf("%c",&sexo);
  printf("Qual sua altura?");
  scanf("%f",&altura);

  if (sexo=='M') printf("O peso ideal %f", 72.7*altura-58);
  else printf("O peso ideal %f", 62.1*altura-44.7);
  return 0;
}