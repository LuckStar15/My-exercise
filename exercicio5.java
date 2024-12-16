package Fundamentos3;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner p = new Scanner (System.in);
		System.out.println("Digite um texto:");
		String texto = p.nextLine();
		String resultado = texto.toUpperCase();
		System.out.println(resultado);

	}

}
