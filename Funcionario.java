package Heranca;

public class Funcionario extends Pessoa {

	public Funcionario() {
		
	}
	public Funcionario(String nome, String cpf, String telefone) {
		super(nome, cpf, telefone);
	}
	public void receberDever() {
		System.out.println("Dever reccebido");
	}
	

}
