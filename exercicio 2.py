notas = ["","","","",""]
t = len(notas)
soma = 0
cont = 0
media = float(input("Digite uma média:"))
for i in range(t):
    notas[i]=float(input("digite uma nota:"))

for x in range(t):
    soma +=notas[x]
media = soma/t
for y in range(t):
    if notas[y]>=media:
        cont+=1
print(f"temos {cont} alunos com a nota maior ou igual a {media}")
