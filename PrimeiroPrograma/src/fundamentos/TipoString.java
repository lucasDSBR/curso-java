package fundamentos;

import java.util.Scanner;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal");
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa"));
		
		System.out.println(s.concat("Digite algo: "));
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		System.out.println("\n Nome digitado: "+ nome);
		
		entrada.close();
	}
}
