package acabou;

import java.util.Scanner;

public class Triatleta implements Ciclista,Corredor,Nadador{
	
	String nome,idade;
	boolean aquecer;
	
	public Triatleta(){

	}
	public Triatleta(String nome,String idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public void aquecer(){
		System.out.println("Atleta está aquecendo");
		aquecer = true;
		if(aquecer == true) {
			System.out.println("Atleta já estar aquecido");
		}
	}
	
	public void pedalar(){
		if (this.aquecer == true ) {
		System.out.println("atleta está pedalando");
		
		}
		else {
			System.out.println("Atleta precisa aquecer pra pedalar");
		}
	}
	
	public void nadar(){
		if (this.aquecer == true ) {
		System.out.println("atleta está nadando");
		}
		else {
			System.out.println("Atleta precisa aquecer pra nadar");
		}
	}
	
	public void correr(){
		if (this.aquecer == true ) {
		System.out.println("atleta está correndo");
		}
		else {
			System.out.println("Atleta precisa aquecer pra correr");
		}
	}
}
