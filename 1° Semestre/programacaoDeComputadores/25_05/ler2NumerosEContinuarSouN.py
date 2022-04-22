'''

Ler 2 números e mostrar a soma.

Quer continuar (S/N)??

'''

op = 's'

while (op =='s' or op =='S'):

  print ("\nDigite um número:")

  A = int(input())

  print ("Digite outro número:")

  B = int(input())

  print ("A soma é",A+B)

  print ("Quer continuar <S/N>?")

  op = input()