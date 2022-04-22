

print ("Digite a PRIMEIRA nota: ")

A = float(input())

while (A < 0 or A > 10):

  print ("Nota inválida! Digite a PRIMEIRA nota novamente: ")

  A = float(input())





print ("\nDigite a SEGUNDA nota: ")

B = float(input())

while (B < 0 or B > 10):

  print ("Nota inválida!Digite a SEGUNDA nota novamente: ")

  B = float(input())



print ("\nA média é ",(A+B)/2)