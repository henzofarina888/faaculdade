print("Olá, quantos pontos foram feitos?")
p= int(input())

if(p<=30):
  print("Regular")
else:
  if(p<=60):
    print("Bom")
  else:
    if(p<=90):
      print("Muito bom")
    else:
      if(p<=100):
        print("Ótimo")
      else:
        print ("Pontuação inválida")
