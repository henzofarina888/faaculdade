#include <stdio.h>
int main(void) 
{
  int mes;
  printf("digite um número inteiro de 1 a 12:");
  scanf("%d",&mes);

  if(mes == 1) printf("JANEIRO");
  else if (mes==2) printf("FEVEREIRO");
       else if (mes==3) printf("MARÇO");
            else if (mes==4) printf("ABRIL");
                 else if (mes==5) printf("MAIO");
                      else if (mes==6) printf("JUNHO");
                           else if (mes==7) printf("JULHO");
                                else if (mes==8) printf("AGOSTO");
                                     else if (mes==9) printf("SETEMBRO");
                                          else if (mes==10) printf("OUTUBRO");
                                               else if (mes==11) printf("NOVEMBRO");
                                                    else if (mes==12) printf("DEZEMBRO");
                                                         else printf("Número inválido");
  return 0;
}