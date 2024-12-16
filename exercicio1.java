package Fundamentos3;

public class exercicio1 {

	public static void main(String[] args) {
		String str = "hello";
		String resultado = str.replace("l","w");
		System.out.println(resultado); //substitui as letras
		
		String str2 = "hello World";
		String resultado2 = str2.substring(6);
		System.out.println(resultado2); //vai printar a partir do ponto especifico
		
		String str3 = "HELLO";
		String resultado3 = str3.toLowerCase();
		System.out.println(resultado3); //vai printar as letras em minusculo
		
		String str4 = "    hello";
		String resultado4 = str4.trim();
		System.out.println(resultado4); //vai printar sem o espaço dado
		
		String str5 = "hello";
		char resultado5 = str5.charAt(1); //vai printar a letra especifica da posição da palavra
		System.out.println(resultado5);
		
		String s1 = "Hello";
		String s2 = "HELLO";
		boolean b1 = s1.equals("Hello"); //vai comparar se é igual ou falso 
		boolean b2 = s1.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2); //vai comparar se é igual ou falso ignorando as letras maiusculas e minusculas da palavra
		boolean b4 = s1.equalsIgnoreCase("azul");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		

	}

}
