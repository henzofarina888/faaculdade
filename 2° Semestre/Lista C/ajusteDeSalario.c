#include <stdio.h>

int main(void) {
  float sal;
  printf("qual seu salário:");
  scanf("%f",&sal);

  if (sal<=2000) printf("O seu novo salário será: R$%2.f",(sal*1.5));
  else if (sal<=5000) printf("O seu novo salário será: R$%2.f",(sal*1.2));
       else printf("O seu novo salário será: R$%2.f",(sal*1.1));
  return 0;
}