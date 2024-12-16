package Metodos;

public class LojaDeCarro {

	public static void main(String[] args) {
		carro c1 = new carro();
		System.out.printf("O carro é um(a) %s de cor %s, seu preço é:%s\n",c1.modelo,c1.cor,c1.preco);
		c1.ligar();
		c1.desligar();
		
	}

}
