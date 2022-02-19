package Controle;

import javax.swing.JOptionPane;

public class IFElse {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe o número:");
		int numero = Integer.parseInt(valor);
		
		
		if(numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Valor digitado é um numero PAR.");
		}else {
			JOptionPane.showMessageDialog(null, "Valor digitado é um numero IMPAR.");
		}
		
	}
}
