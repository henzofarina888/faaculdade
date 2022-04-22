#include <stdio.h>

int main(void) 
{
  float a, b, c;
  printf("Primeiro número");
  scanf("%f",&a);
  printf("Segundo número");
  scanf("%f",&b);
  printf("Terceiro número");
  scanf("%f",&c);

  if((a>b)&&(a>c)) printf("O maior é %2.f",a);
  else if ((b>a)&&(b>c))printf("O maior é %2.f",b);
       else printf("O maior é %2.f",c);
  return 0;
}