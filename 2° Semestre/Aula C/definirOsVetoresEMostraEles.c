#include <stdio.h>

int main(void) {
  int i;
  float vet [10];

  for (i=1; i<=9; i++)
  {
    printf("Digite a nota do vet[%d] :",i);
    scanf("%f",&vet[i]);
  }

  for (i=0; i<=9; i++){
    printf("\n%.1f",vet[i]);
  }
    

  return 0;
}