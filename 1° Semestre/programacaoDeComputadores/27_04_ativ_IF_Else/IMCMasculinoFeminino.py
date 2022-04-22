print("Olá, F ou M ?")
s = input()
print("Qual sua altura ?(Metros)")
alt = float(input())

h= 72.7*alt-58
mu= 62.1*alt-44.7

if s in "Mm":
 print("Seu peso ideal é",h,"Kg")
else:
  if s in "fF":
    print("Seu peso ideal é",mu,"Kg")
  else:
    print("resposta inválida, possiveis resposta: F ou M")
