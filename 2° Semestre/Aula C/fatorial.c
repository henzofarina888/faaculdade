#include <stdio.h>

int main(void) 
{
  int n, cont, fat;
  fat=1;
  printf("digite um número:");
  scanf("%d",&n);
  if(n<0) printf("Não existe Fatorial");
  else if (n==0) printf("Fatorial = 1");
       else { for (cont=1; cont<=n; cont++)
                  fat= fat*cont;
              printf(" fatorial= %d",fat);
            }


  return 0;
}