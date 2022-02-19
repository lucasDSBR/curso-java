package fundamentos;

import java.util.Scanner;

public class wrapper {
	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		// Integer.parseInt(entrada.next());
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
	}
}
