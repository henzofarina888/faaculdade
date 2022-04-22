#include <stdio.h>
int main(void) 
{
  char tipo;
  float litro;
  printf("Qual o combustível? (A para álcool e G para gasolina)");
  scanf("%s",&tipo);
  printf("Quantos litros vai ser?");
  scanf("%f",&litro);

  if (tipo=='A')
    {
      if (litro<=20) printf("O valor a ser pago será: R$%2.f",litro*(3.9-3.9*0.03));
      else if (litro>20) printf("O valor a ser pago será: R$%2.f",litro*(3.9-3.9*0.05));
    }  
  else if (tipo=='G')
     {
      if (litro<=20) printf("O valor a ser pago será: R$%2.f",litro*(5.3-5.3*0.04));
      else if (litro>20) printf("O valor a ser pago será: R$%2.f",litro*(5.3-5.3*0.06));
    }  
  return 0;
}