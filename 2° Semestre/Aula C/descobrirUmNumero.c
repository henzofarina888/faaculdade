#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int main(void) 
{
  int magico, num, tentativa;
  srand(time(NULL));

  magico= rand() %11;
  printf("O número magico é %d\n\n", magico);

  num=1235465112;
  while(num!=magico)
  {
  printf("\nQual o número secreto");
  scanf("%d",&num);
  tentativa++;

  if (num==magico) printf("acertou o número na %d° tentativa.",tentativa);
  else printf("xiii vc errou!!");
  
  }

  return 0;
}