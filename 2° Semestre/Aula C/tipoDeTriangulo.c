#include <stdio.h>

int main(void) 
{
  float a, b, c;
  printf("digite a medida do 1° lado");
  scanf("%f",&a);
  printf("digite a medida do 2° lado");
  scanf("%f",&b);
  printf("digite a medida do 3° lado");
  scanf("%f",&c);

  if ((a<b+c)&&(b<a+c)&&(c<a+b));
  {
    printf("existe triangulo");
    if ((a==b)&&(b==c)&&(a==c)) printf("equilatero");
    else if ((a==b)||(b==c)||(a==c)) printf("isosceles");
         else printf("escaleno");

  }
  else printf("essas medidas não são de um triangulo.");
  
  return 0;

}