package classes;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro sal�rio:");
		String salario1 = entrada.next().replace(",", ".");
		
		System.out.print("Digite o segundo sal�rio:");
		String salario2 = entrada.next().replace(",", ".");
		
		System.out.print("Digite o terceiro sal�rio:");
		String salario3 = entrada.next().replace(",", ".");
		
		//Convertendo string para int
		
		double numeroSalario1 = Double.parseDouble(salario1);
		double numeroSalario2 = Double.parseDouble(salario2);
		double numeroSalario3 = Double.parseDouble(salario3);
		
		Double media = (numeroSalario1 + numeroSalario2 + numeroSalario3)/3;
		
		System.out.println("A media dos sal�rios �: "+media);
		
	}
}
