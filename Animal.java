package encapsulamento;

import java.util.Scanner;

public class Animal {
	String nome,tutor,rg,tipo,raca,mesVersario,idade;
	
	public Animal(){
		Scanner p = new Scanner (System.in);
		System.out.println("Digite o nome do animal:");
		this.nome = p.next();
		System.out.println("Digite o nome do tutor:");
		this.tutor = p.next();
		System.out.println("Digite o rg:");
		this.rg = p.next();
		System.out.println("Digite o tipo do animal:");
		this.tipo = p.next();
		System.out.println("Digite a raca do animal:");
		this.raca = p.next();
		System.out.println("Digite o mês versário:");
		this.mesVersario = p.next();
		System.out.println("Digite a idade do animal:");
		this.idade = p.next();
		
	}
	
	public Animal(String nome,String tutor,String rg,String tipo,String raca,String mesVersario,String idade ) {
		this.nome = nome;
		this.tutor = tutor;
		this.rg = rg;
		this.tipo = tipo;
		this.raca = raca;
		this.mesVersario = mesVersario;
		this.idade = idade;
		
	}

}