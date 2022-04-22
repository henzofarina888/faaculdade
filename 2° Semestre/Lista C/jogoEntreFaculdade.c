#include <stdio.h>

int main(void) 
{
  int pu, puv;
  printf("Quantos pontos o time da UNICID fez?");
  scanf("%d",&pu);
  printf("Quantos pontos o time da universidade visitante fez?");
  scanf("%d",&puv);

  if (pu>puv) printf("Vitória");
  else if (puv>pu) printf("Derrota");
       else printf("Empate");
}