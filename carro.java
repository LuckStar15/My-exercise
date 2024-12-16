package Metodos;

import java.util.Scanner;

public class carro {
String modelo, cor;
double preco;
boolean ligado,desligado;
	
public carro() {
	Scanner p = new Scanner (System.in);
	System.out.println("digite o nome do modelo:");
	modelo = p.next();
	this.modelo = modelo;
	System.out.println("Digite a cor:");
	cor = p.next();
	this.cor = cor;
	System.out.println("Digite o preço do carro:");
	preco = p.nextDouble();
	this.preco = preco;
	this.ligado = false;
		
}
public carro(String modelo) {
	this.modelo = modelo;
	
}
public carro(String modelo, String cor) {
	this.modelo = modelo;
	this.cor = cor;
	
}
public carro(String modelo, String cor, double preco) {
	Scanner p = new Scanner (System.in);
	System.out.println("digite o nome do modelo:");
	modelo = p.next();
	this.modelo = modelo;
	System.out.println("Digite a cor:");
	cor = p.next();
	this.cor = cor;
	System.out.println("Digite o preço do carro:");
	preco = p.nextDouble();
	this.preco = preco;
	this.ligado = false;
	
}
public void ligar() {
	if (this.desligado == false) {
	System.out.println("Carro está ligado");
	this.ligado = true;
	}
	
}
public void desligar() {
	if (this.ligado == true) {
	System.out.println("Carro está desligado");
	}		
	}
public void acelerar() {
	System.out.println("Carro está acelerando");
	
}
public void freiar() {
	System.out.println("Carro está freiando");
	
}
}
