package Heranca;

public class Escola {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Professor p1 = new Professor();
		System.out.printf("o aluno %s possui o cpf %s e seu telefone é %s\n",a1.nome,a1.cpf,a1.telefone);
		System.out.printf("o professor %s possui o cpf %s e seu telefone é %s\n",p1.nome,p1.cpf,p1.telefone);
		
		p1.aplicarProva();
		a1.sofrer();
		
		

	}

}
