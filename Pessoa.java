package Heranca;

import java.util.Scanner;

public class Pessoa {
	String nome,cpf,telefone;

public Pessoa() {
	Scanner p = new Scanner (System.in);
	System.out.println("Digite seu nome:");
	this.nome = p.next();
	System.out.println("Digite seu CPF:");
	this.cpf = p.next();
	System.out.println("Digite seu telefone:");
	this.telefone = p.next();
	
}

public Pessoa(String nome,String cpf,String telefone) {
	this.nome = nome;
	this.cpf = cpf;
	this.telefone = telefone;
		
}
}