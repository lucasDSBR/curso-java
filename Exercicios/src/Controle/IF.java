package Controle;

import java.util.Scanner;

public class IF {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a m�dia: ");
		double media = entrada.nextDouble();

		if (media >= 7.0) {
			System.out.print("Voc� passou!! Parab�ns");
		} else {
			System.out.print("Desculpe, voc� n�o passou.");
		}

		entrada.close();
	}
}
