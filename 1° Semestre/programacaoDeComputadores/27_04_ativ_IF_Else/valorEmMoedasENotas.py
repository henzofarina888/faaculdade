print("Olá, digite o valor de moedas:")
mo = int(input())

m100i= mo//100
m100r= mo%100
m50i= m100r//50
m50r= m100r%50
m10i= m50r//10
m10r= m50r%10
m5i= m10r//5
m5r= m10r%5
m1i= m5r//1
m1r= m5r%1

  

print(m100i,"moeda(s) de M$ 100")
print(m50i,"moeda(s) de M$ 50")
print(m10i,"moeda(s) de M$ 10")
print(m5i,"moeda(s) de M$ 5")
print(m1i,"moeda(s) de M$ 1")
