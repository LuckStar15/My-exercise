n = ["","","","","","","","","",""]
t = len(n)
n2 = ["","","","","","","","","",""]
mult = 0
for i in range(t):
    n[i]=int(input(f"digite o {i+1} número:"))
mult = int(input("digite o multiplicador:"))

for x in  range(t):
    n2[x]=n[i]*mult

print(n)
print(mult)
print(n2)