print("\nOlá, qual o número total de eleitores:")
e= int(input())

print("\nQual o números de votos em branco:")
b= int(input())

print("\nQual o números de votos nulos:")
n= int(input())

print("\nQual o números de votos válidos:")
v= int(input())

x1= b/e*100
x2= n/e*100
x3= v/e*100

print("\n\nO porccentagem de votos em branco:",x1,"%")
print("\nO porcentagem de votos nulos:",x2,"%")
print("\nO porccentagem de votos válidos:",x3,"%")
