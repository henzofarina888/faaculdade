#include <stdio.h>

int main(void) 
{
  int contador;
  for (contador=18; contador>=1; contador=contador-2)
  {
    printf("\n%d",contador);
    printf("\t%d",contador);
  }
  
  return 0;
}