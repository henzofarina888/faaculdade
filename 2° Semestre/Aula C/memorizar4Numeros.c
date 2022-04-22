#include <stdio.h>   
#include <stdlib.h>  
#include <time.h>  
#include <unistd.h>  
int main(void)
{
  int x1, x2, x3, x4;
  int n1, n2, n3, n4;
  int v= 3;
  srand (time (NULL));
  
  while (v != 0)
  {
    system ("clear");
    x1 = rand() % 51;  
    x2 = rand() % 51;  
    x3 = rand() % 51;  
    x4 = rand() % 51;  

    printf ("\n\nMEMORIZANDO");
    printf ("\n%d \t %d \t %d \t %d",x1,x2,x3,x4);  
    printf ("\nAgora é sua vez....");
    sleep (5);
    system ("clear");
    printf ("\nDigite os 4 números apresentados no vídeo\n\n");
    printf ("1º número...: "); scanf ("%d",&n1);
    printf ("2º número...: "); scanf ("%d",&n2);
    printf ("3º número...: "); scanf ("%d",&n3);
    printf ("4º número...: "); scanf ("%d",&n4);

    if (n1==x1 && n2==x2 && n3==x3 && n4==x4) 
       {
        v = v + 2;
        printf ("Você ganhou 2 vidas!!!");
       }
    else if (n1!=x1 && n2!=x2 && n3!=x3 && n4!=x4) 
            {
             v=0; 
             printf ("Você perdeu tudo!!!");
           }
  
    if (v !=0) 
     {
          printf ("\n\nVocê tem %d vidas\n<Pressione uma tecla qualquer para continuar>",v);
          getchar(); getchar();
     }
  } return 0;}