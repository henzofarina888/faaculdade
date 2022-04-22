print("Qual a pontuação do time da UNICID?")
uni= int(input())
print("Qual a pontuação do time visitante?")
vi= int(input())

if(uni>vi):
  print("Vitória da UNICID ")
else:
  if(uni<vi):
    print("Derrota da UNICID")
  else:
    print("Deu empate")
