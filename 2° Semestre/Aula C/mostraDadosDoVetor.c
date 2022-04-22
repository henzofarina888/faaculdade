#include <stdio.h>

int main(void) {
  int vet[14];
  int i;
  
  for(i=0; i>=13; i++)
  {
   printf("\nDigite a nota do vet[%d]:",i);
   scanf("\n%d",&vet[i]); 
  }
  for(i=13; i>=0; i--){
   printf("\n%d",vet[i]); 
  }
  return 0;
}