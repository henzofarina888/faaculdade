print ("Olá, qual foi número de carros vendidos:")
ncar = float(input())
print ("Qual o valor fixo de comissão de cada carros:")
ccar = float(input())
print("Qual o valor total das vendas:")
vtcar= float(input())
print("Qual o sálario fixo:")
sal= float (input())

cmpcar= ncar*ccar
cmttcar= vtcar*0.05
saltt= cmpcar + cmttcar + sal

print("Seu sálario é R$",saltt)