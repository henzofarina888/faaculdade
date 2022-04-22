#include <stdio.h>
int main(void) 
{
  float n1, n2, n3;
  printf("Qual o primeiro número:");
  scanf("%f",&n1);
  printf("Qual o segundo número:");
  scanf("%f",&n2);
  printf("Qual o terceiro número:");
  scanf("%f",&n3);

  if (n1>n2 && n2>n3)                           printf("O maior número é %2.f,%2.f,%2.f", n1, n2, n3);
  else if (n1>n3 && n3>n2)                      printf("O maior número é %2.f,%2.f,%2.f", n1, n3, n2);
       else if (n2>n1 && n1>n3)                 printf("O maior número é %2.f,%2.f,%2.f", n2, n1, n3);
            else if (n2>n3 && n3>n1)            printf("O maior número é %2.f,%2.f,%2.f", n2, n3, n1);
                 else if (n3>n2 && n2>n1)       printf("O maior número é %2.f,%2.f,%2.f", n3, n2, n1);
                      else if (n3>n1 && n1>n3)  printf("O maior número é %2.f,%2.f,%2.f", n3, n1, n3);
  return 0;     
}