n = [0]*5
t = len(n)
maior = 0
menor = 0
for i in range(t):
    n[i] = int(input(f"Digite o {i + 1}° valor:"))
for x in range(t):
    if n[x]%2 == 0:
        print(f"os números pares são:{n}")
    if n[x] > maior:
        maior = n[x]

    if menor < n[x]:
        menor = n[x]
print(f"O maior número é {maior}")
print(f"O menor número é {menor}")