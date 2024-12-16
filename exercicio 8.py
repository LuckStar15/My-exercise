c = 0
n = [0]*10
t = len(n)
for i in range(t):
    n[i] = int(input("Digite uma sequência de número:"))
p = input("Digite o número de pesuisa:")

for x in range(t):
    if p == n[x]:
        c += 1
print(f"o número 5 em sua sequência aparece {c} vezes ")