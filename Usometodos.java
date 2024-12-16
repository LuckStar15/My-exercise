package Metodos;

public class Usometodos {

	public static void main(String[] args) {
		calculadora c1 = new calculadora();
		
		double resp = c1.somar(4.5, 100.45, 1);
		System.out.println(resp);
		
		double resp2 = c1.dividir(10, 8, 2);
		System.out.println(resp2);
				
	}
}
