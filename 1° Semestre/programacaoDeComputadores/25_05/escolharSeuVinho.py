c1 = 0

c2 = 0

c3 = 0

c4 = 0

op = 99 #precisa ser diferente de b0 para gerar while

while (op != 0):

  print ("\nMenu")

  print ("1 = Vinho Tinto")

  print ("2 = Vinho Branco")

  print ("3 = Vinho Rosé")

  print ("4 = Não gosta de vinho")

  print ("Digite sua opção (1/2/3/4) <0 para sair>: ")

  op = int(input())

  if (op==1):

    c1 = c1 + 1

  elif (op==2):

    c2 = c2+ 1

  elif (op==3):

    c3 = c3 + 1

  elif (op==4):

    c4 = c4 + 1

  elif (op==0):

    break

  else:

    print ("Opção inválida!!!!")



total = c1 + c2 + c3 + c4

print ("\nRelatório Final")

print ("Opção 1: Vinho Tinto  = ", c1,"votos -----> ",round(c1/total*100,2),"\b%")

print ("Opção 2: Vinho Branco = ", c2,"votos -----> ",round(c2/total*100,2),"\b%")

print ("Opção 3: Vinho Rosé   = ", c3,"votos -----> ",round(c3/total*100,2),"\b%")

print ("Opção 4: Não gosta    = ", c4,"votos -----> ",round(c4/total*100,2),"\b%")