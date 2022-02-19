package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informa��es do Funcionario
		
		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 543;
		int id = 56000;
		long pontosAcumulados = 3_234_845_223L;
		
		// Tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01F;
		
		// Tipos booleano
		boolean estaDeFerias = false; //ou true
		
		// Tipo Caractere 
		char status = 'A';
		
		// Dias da empresa
		System.out.println(anosDeEmpresa * 365);
		
		// N�meros de viagens
		System.out.println(numerosDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> "+ salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: "+ status);
	}
}
