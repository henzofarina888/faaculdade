#include <stdio.h>

int main(void) 
{
  float n1,n2,m;
  printf("Digite a primeiro nota:");
  scanf("%f",&n1);
  printf("Digite a segunda nota:");
  scanf("%f",&n2);

  m = (n1+n2)/2;
  printf("A media do aluno é %.2f",m);
  return 0;
}