print("qual seu pedo?")
p= float(input())
print ("Qual sua altura?")
a= float (input())

imc= p/(a*a)
print("seu IMC é de ", imc)
if (imc<= 18.5):
  print("magro")
else:
  if (imc <= 25):
    print("normal")
  else:
    if(imc<=30):
      print("gordinho")
    else:
      print("obeso")