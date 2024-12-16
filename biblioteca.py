#Criação de classe Pascal case (a primeira letra de alguma palavra é sempre maiuscula)
#metodo construtor [Def _Init_ (self):]
class Pessoa:
    def __init__(self,nome,peso,idade):
        self.nome=nome
        self.peso=peso
        self.idade=idade
        self.falando=False
        self.comendo=False
        self.dormindo=False
# \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    def falar(self,lingua):
        if self.falando == False:
            if self.comendo == False:
                if self.dormindo == False:
                    print(f"{self.nome} está falando {lingua}")
                    self.falando = True
                else:
                    print(f"{self.nome} não pode falar pois está dormindo")
            else:
                print(f"{self.nome} não pode falar pois está comendo")
        else:
            print(f"{self.nome} ja está falando")

    def paraFalar(self):
        print(f"{self.nome} parou de falar")
        self.falando = False
# \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    def comer(self,alimento):
        if self.comendo == False:
            if self.falando == False:
                if self.dormindo == False:
                    print(f"{self.nome} está comendo {alimento}")
                    self.comendo = True
                else:
                    print(f"{self.nome} não pode comer pois está dormindo")
            else:
                print(f"{self.nome} não pode comer pois está falando")
        else:
            print(f"{self.nome} ja está comendo")

    def pararComer(self):
        print(f"{self.nome} parou de comer")
        self.comendo = False
# \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    def dormir(self):
        if self.dormindo == False:
            if self.comendo == False:
                if self.falando == False:
                    print(f"{self.nome} está dormindo")
                    self.dormindo = True
                else:
                    print(f"{self.nome} não pode dormir pois está falando")
            else:
                print(f"{self.nome} não pode dormir pois está comendo")
        else:
            print(f"{self.nome} ja está dormindo")

    def pararDomir(self):
        print(f"{self.nome} parou de dormir")
        self.dormindo = False
class Animal:
    def __init__(self,nome,cor):
        self.nome=nome
        self.cor=cor

    def comer(self,alimento):
        print(f"{self.nome} foi comer {alimento}")

class Gato(Animal):
    def __init__(self,nome,cor):
        super().__init__(nome,cor)
#O super está carregando a super class nesse caso (a class Animal)
    def miar(self):
        print(f"O {self.nome} está miando")

class Vaca(Animal):
    def __int__(self,nome):
        super().__init__(nome)

    def mugir(self):
        print(f"A {self.nome} está mugindo")

    def cagar(self):
        print(f"{self.nome} está cagando")

    def pararCagar(self):
        print(f"{self.nome} parou de cagar")
class Atleta:
    def __init__(self,nome,peso):
        self.nome=nome
        self.peso=peso
        self.aquecendo=False
        self.aposentado=False

    def aposentar(self):
        print(f"{self.nome} está aposentando")
        self.aposentado=True

    def aquecer(self):
        print(f"{self.nome} está aquecendo")
        self.aquecendo=True
class Nadador(Atleta):
    def __init__(self,nome,peso):
        super().__init__(nome,peso)

    def nadar(self):
        if self.aquecendo == True:
            if self.aposentado == False:
              print(f"{self.nome} Foi nadar")

            else:
                print(f"{self.nome} não pode nadar pois está aposentado")
        else:
            print(f"{self.nome} precisa aquecer para nadar")
class Corredor(Atleta):
    def __init__(self, nome, peso):
        super().__init__(nome, peso)

    def correr(self):
        if self.aquecendo == True:
            if self.aposentado == False:
              print(f"{self.nome} Foi correr")

            else:
                print(f"{self.nome} não pode correr pois está aposentado")
        else:
            print(f"{self.nome} precisa se aquecer primeiro antes de correr")
class Cilista(Atleta):
    def __init__(self, nome, peso):
        super().__init__(nome, peso)

    def pedalar(self):
        if self.aquecendo == True:
            if self.aposentado == False:
              print(f"{self.nome} Foi pedalar")

            else:
                print(f"{self.nome} não pode pedalar pois está aposentado")
        else:
            print(f"{self.nome} precisa se aquecer primeiro antes de pedalar")
class Triatleta(Nadador,Cilista,Corredor):
    def __init__(self, nome,peso):
        super().__init__(nome,peso)

def gravar(texto):
    with open("registro.txt", "a") as arquivo:
        arquivo.write(f"{texto}\n")

def leitor():
    with open("registro.txt", "r") as arquivo2:
        txt = arquivo2.read()
        print(txt)

