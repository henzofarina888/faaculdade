#include <stdio.h>

int main(void) 
{
  float altu, base, area;
  printf("Qual a altura da sala(em metros)?");
  scanf("%f",&altu);
  printf("Qual a base da sala(em metros)?");
  scanf("%f",&base);

  area = altu*base;
  
  printf("A área da sala é %.2f",area);

  return 0;
}