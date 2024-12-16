texto = input("Digite um texto:")
t = len(texto)
v = 0
for i in texto:
    if i in "qwertyuiopasdfghjklzxcvbnmçQWERTYUIOPASDFGHJKLÇZXCVBNM":
        v += 1
print(v)
for x in range(t-1,-1,-1):
    print(texto[x] , end="")