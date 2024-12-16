n = [""]*5
s = [""]*5
t = len(n)
for i in range(t):
    n[i] = input(f"Digite o {i + 1}º nome:")
    s[i] = input(f"Digite a {i + 1}º senha:")

for x in range(t):
    print(f"Posição:{x}\nº"
          f"Nome:{n[x]}\n"
          f"Senha:{s[x]}")
