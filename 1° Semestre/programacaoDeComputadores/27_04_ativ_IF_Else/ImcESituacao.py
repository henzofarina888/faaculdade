print ("Olá, qual sua altura?")
alt = float(input())
print ("qual seu peso?(Kg)")
peso = float(input())

imc = peso/(alt*alt)

if(imc<18.5):
  print ("Você esta MAGRO")
else:
  if(imc<25):
    print("Você esta no seu peso ideal(NORMAL)")
  else:
    if (imc<30):
      print("Você esta com SOBREPESO")
    else:
      print("Você esta OBESO")