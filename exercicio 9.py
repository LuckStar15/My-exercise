usuarios = [""]*5
t = len(usuarios)
for i in range(t):
    usuarios[i] = input(f"Digite o {i + 1}° nome:")
print(f"A lista de usuarios é:\n"
      f"{usuarios[i]}//",end="")

for x in range(t-1,-1,-1):
    print(f"{usuarios[x]}//",end="")