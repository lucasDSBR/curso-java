package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		double a = 2.3;
		String s = "Bom dia";
		String us = s.toUpperCase();
		
		us = us.replace("BOM", "BOA");
		us = us.replace("DIA", "NOITE");
		us = us.concat(" --> saudação.");
		System.out.println(us);
	}
}
