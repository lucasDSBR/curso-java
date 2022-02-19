package Controle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String diaSemana = entrada.next();
		diaSemana = diaSemana.toLowerCase();
		//equalsIgnoreCase(...);
		if(diaSemana.equals("domingo")) {
			JOptionPane.showMessageDialog(null, "Dia 1");
			
		}else if(diaSemana.equals("segunda")) {
			JOptionPane.showMessageDialog(null, "Dia 2");
			
		}else if(diaSemana.equals("terça")) {
			JOptionPane.showMessageDialog(null, "Dia 3");
			
		}else if(diaSemana.equals("quarta")) {
			JOptionPane.showMessageDialog(null, "Dia 4");
			
		}else if(diaSemana.equals("quinta")) 	{
			JOptionPane.showMessageDialog(null, "Dia 5");
			
		}else if(diaSemana.equals("sexta")) {
			JOptionPane.showMessageDialog(null, "Dia 6");
			
		}else {
			JOptionPane.showMessageDialog(null, "Teste");
			
		}
		
		entrada.close();
	}
}
