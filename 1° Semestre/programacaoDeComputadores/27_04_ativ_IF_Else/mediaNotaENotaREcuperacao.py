print("Olá, qual sua primeira nota?")
n1= float(input())
print("Qual sua segunda nota?")
n2= float(input())
print("Qual sua terceira nota?")
n3= float(input())
 
m= (n1+n2+n3)/3

if (m>=7.0):
  print("APROVADO")
else:
  print("Reprovado, qual sua nora de recuperação?")
  r= float(input())
  if(r>=5):
    print("Aprovado na recuperação")
  else:
    print("REPROVADO")
