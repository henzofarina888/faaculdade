print ("Olá digite sua primeira nota:", end="")
n1= float(input())

print ("Segunda nota:", end="")
n2= float(input())

md= (n1 + n2)/2

print("Sua media é", md)

if (md >= 7):
  print ("Aluno aprovado")
  print ("parabéns")
else:
  if(md < 5):
    print("Aluno reprovado")
    print("Que pena!!!")
  else:
    print("Aluno esta de exame")
    print ("Vamos estuda...")