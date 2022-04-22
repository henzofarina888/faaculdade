import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
    Scanner ler= new Scanner(System.in);
    System.out.println("Hello world!");
    float x, y;
    System.out.printf("qual a coordenada do ponto X?");
    x= ler.nextFloat();
    System.out.printf("qual a coordenada do ponto Y?");
    y= ler.nextFloat();

    if ((y>0)&&(x<0)) System.out.printf ("está no segundo quadrante.");
    else if ((y>0)&&(x>0)) System.out.printf ("está no primeiro quadrante.");
        else if ((y<0)&&(x<0)) System.out.printf ("está no terceiro quadrante.");
              else if ((y==0)&&(x==0)) System.out.printf ("está na ORIGEM.");
                  else if ((y==0)&&(x!=0)) System.out.printf ("está no EIXO X.");
                        else if ((y!=0)&&(x==0)) System.out.printf ("está no EIXO Y.");
  }
}