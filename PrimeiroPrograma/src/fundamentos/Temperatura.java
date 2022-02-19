package fundamentos;
import java.util.Scanner;
public class Temperatura {
	public static void main(String[] args) {
		// (°F -  32) * (5/9) = °C
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um valor em fahrenheit: ");
		double fah = ler.nextInt();
		double calculo = (fah - 32) * (5/9.0);
		System.out.println("Valor em grau celsios");
		System.out.println(calculo);
	}
}
