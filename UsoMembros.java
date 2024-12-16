package Membros;

public class UsoMembros {

	public static void main(String[] args) {
		DataNascimento dt = new DataNascimento();
		DataNascimento dt2 = new DataNascimento();
		
		System.out.printf("A sua data nascimento é %s/%s/%s\n",dt.dia,dt.mes,dt.ano);
		System.out.printf("A sua data nascimento é %s/%s/%s\n",dt2.dia,dt2.mes,dt2.ano);

	}

}
