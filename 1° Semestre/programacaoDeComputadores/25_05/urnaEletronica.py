
c1 = 0

c2 = 0

c3 = 0

c4 = 0

c5 = 0

c6 = 0

voto = 99 #precisa ser diferente de zero para entrar no while

while (voto != 0):

  print ("\nMenu")

  print ("1 = Bolsonaro")

  print ("2 = Lula")

  print ("3 = Marina")

  print ("4 = Doria")

  print ("5 = NULO")

  print ("6 = EM BRANCO")

  print ("Digite seu voto (1/2/3/4/5/6) <0 para sair>: ")

  voto = int(input())

  if (voto==1):

    c1 = c1 + 1

  elif (voto==2):

    c2 = c2+ 1

  elif (voto==3):

    c3 = c3 + 1

  elif (voto==4):

    c4 = c4 + 1

  elif (voto==5):

    c5 = c5 + 1

  elif (voto==6):

    c6 = c6 + 1

  elif (voto==0):

    break

  else:

    print ("Voto inválido!!!!")

print ("\nRelatório Final")

print ("Candidato 1 = Bolsonaro ---------> ", c1,"votos")

print ("Candidato 2 = Lula --------------> ", c2,"votos")

print ("Candidato 3 = Marina ------------> ", c3,"votos")

print ("Candidato 4 = Doria -------------> ", c4,"votos")

print ("Voto NULO -----------------------> ", c5,"votos")

print ("Em BRANCO -----------------------> ", c6,"votos")