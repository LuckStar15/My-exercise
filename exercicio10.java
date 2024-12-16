package Fundamentos2;

public class exercicio10 {

	public static void main(String[] args)  {
		int somat = 0, mult3 = 0, mult5 = 0;
		for (int i = 0; i <= 20; i++) {
			if (i % 3 == 0) {
				mult3+=i;
			}
			if (i % 5 == 0) {
				mult5+=i;
			}
		}
		somat = mult3 + mult5;
		System.out.println(mult3);
		System.out.println(mult5);
		System.out.println(somat);
	}

}
