#include <stdio.h>

int main(void) 
{
  float x, y;
  printf("qual a coordenada do ponto X?");
  scanf("%f",&x);
  printf("qual a coordenada do ponto Y?");
  scanf("%f",&y);

  if ((y>0)&&(x<0)) printf ("está no segundo quadrante.");
  else if ((y>0)&&(x>0)) printf ("está no primeiro quadrante.");
       else if ((y<0)&&(x<0)) printf ("está no terceiro quadrante.");
            else if ((y==0)&&(x==0)) printf ("está na ORIGEM.");
                 else if ((y==0)&&(x!=0)) printf ("está no EIXO X.");
                      else if ((y!=0)&&(x==0)) printf ("está no EIXO Y.");
  return 0;
}