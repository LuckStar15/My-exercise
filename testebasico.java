package encapsulamento;

public class testebasico {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		System.out.printf("O animal se chama %s, seu/sua dono(a) se chama %s\nseu RG é:%s\nele(a) é um(a) %s, sua raça é %s\nfaz aniversário no mês %s e e ele(a) tem %s ano(s)\n",a1.nome,a1.tutor,a1.rg,a1.tipo,a1.raca,a1.mesVersario,a1.idade);

	}

}
