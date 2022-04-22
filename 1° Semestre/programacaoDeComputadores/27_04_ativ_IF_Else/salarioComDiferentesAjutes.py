print("digite seu salário:")
sal= float(input())

sal1 = sal+(0.1*sal)
sal2 = sal+(0.2*sal)
sal3 = sal+(0.5*sal)

if sal > 5000:
  print("Seu novo salário é", sal1)
else:
  if sal < 2000:
    print("Seu novo salário é", sal3)
  else:
    print("Seu novo salário é", sal2)