print ("Olá, digite o valor de X?")
x = float (input())
print ("Qual o valor de y?")
y = float (input())


if (x==0 and y==0):
  print("Origem")
elif (x>0 and y>0 ):
  print("Primeiro Quadrante")
elif (x<0 and y>0):
  print("Segundo Quadrante")
elif (x<0 and y<0):
  print("Terceiro Quadrante")
elif (x>0 and y<0):
  print("Quarto Quadrante")
elif (x==0 and y!=0):
  print("Eixo Y")
else:
    print("Eixo X")