#include <stdio.h>

int main(void) 
{
  int nota;
  printf("Qual a nota?");
  scanf("%d",&nota);

  if (nota<=30) printf("REGULAR");
  else if (nota<=60) printf("BOM");
       else if (nota<=90) printf("MUITO BOM");
            else printf("ÓTIMO");

  return 0;
}