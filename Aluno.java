package Heranca;

import java.util.Scanner;

public class Aluno extends Pessoa{
	double nota;
	
	public Aluno() {
		Scanner p = new Scanner (System.in);
		System.out.println("Digite seu nome :");
		this.nome = p.next();
		System.out.println("Digite seu CPF:");
		this.cpf = p.next();
		System.out.println("Digite seu telefone:");
		this.telefone = p.next();
		
	}
	
	public Aluno(String nome,String cpf,String telefone) {
		super(nome,cpf,telefone);
	}
	
	public void sofrer() {
		System.out.println("Aluno sofrendo");
		
	}

}
