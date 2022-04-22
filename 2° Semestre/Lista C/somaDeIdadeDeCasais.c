#include <stdio.h>
int main(void) 
{
  int h1, h2, m2, m1;
  printf("idade do primeiro homem?");
  scanf("%d",&h1);
  printf("idade do segundo homem?");
  scanf("%d",&h2);
  printf("idade do primeira mulher?");
  scanf("%d",&m1);
  printf("idade do segunda mulher?");
  scanf("%d",&m2);

  if (h1>=h2 && m1>=m2) printf("A soma da idade é %d anos\n",h1+m2);
  else if (h1>=h2 && m2>=m1) printf("A soma da idade é %d anos\n",h1+m1);
       else if (h2>=h1 && m1>=m2) printf("A soma da idade é %d anos\n",h2+m2);
            else if (h2>=h1 && m2>=m1) printf("A soma da idade é %d anos\n",h2+m1);
  if (h1>=h2 && m1>=m2) printf("A soma da idade é %d anos",h2+m1);
  else if (h1>=h2 && m2>=m1) printf("A soma da idade é %d anos",h2+m2);
       else if (h2>=h1 && m1>=m2) printf("A soma da idade é %d anos",h1+m1);
            else if (h2>=h1 && m2>=m1) printf("A soma da idade é %d anos",h1+m2);         
  return 0;
}