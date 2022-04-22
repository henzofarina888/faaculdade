print("Olá, qual seu salário?")
sal = float(input())
print("Qual seu gasto mensal?")
gas = float(input())

if sal>=gas:
  print("Gastos dentro do orçamento.")
else:
  print("O orçamento estourou.")
