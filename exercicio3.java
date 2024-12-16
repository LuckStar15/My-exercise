package Fundamentos3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner p = new Scanner (System.in);
		System.out.println("Digite um texto:");
		String texto = p.nextLine();
		int tam = texto.length();
		System.out.println(tam);

	}

}
