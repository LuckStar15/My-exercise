package Membros;

import java.util.Scanner;

public class DataNascimento {
	static int dia;
	int mes,ano;
	
	public DataNascimento() {
		Scanner p = new Scanner (System.in);
		System.out.println("digite seu dia de nascimento:");
		dia = p.nextInt();
		this.dia = dia;
		System.out.println("Digite seu mes de nascimento:");
		mes = p.nextInt();
		this.mes = mes;
		System.out.println("Digite seu ano nascimento:");
		ano = p.nextInt();
		this.ano = ano;
	        }
		
}
