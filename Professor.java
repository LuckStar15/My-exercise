package Heranca;

import java.util.Scanner;

public class Professor extends Pessoa{
	double salario;

	public Professor() {
		Scanner p = new Scanner (System.in);
		System.out.println("Digite seu nome:");
		this.nome = p.next();
		System.out.println("Digite seu CPF:");
		this.cpf = p.next();
		System.out.println("Digite seu telefone:");
		this.telefone = p.next();
	}

	public Professor(String nome,String cpf,String telefone) {
		super(nome,cpf,telefone);
	}
	public void aplicarProva() {
		System.out.println("Professor estar em diversão");
	}
	
	public void certificar() {
		System.out.println("Professor certificou aluno");
		
	}
	
}
