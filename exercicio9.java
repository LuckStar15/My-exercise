package Fundamentos2;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		int aluno = 0;
		double nota = 0, media,soma = 0;
		Scanner p = new Scanner (System.in);
		System.out.println("Digite a quantidade de alunos:");
		aluno = p.nextInt();
		
		for (int i = 1; i <= aluno; i++) {
			 System.out.println("Digite a nota do aluno:");
			 nota = p.nextDouble();
			 soma = soma + nota;
			
			
		}
		media = soma/aluno;
		System.out.println("A média é:" +media);
		
	}

}
