package senai;

import javax.swing.JOptionPane;

public class Desafio08 {

	public static void main(String[] args) {

		String motorista = "";
		boolean cnh = false;
		boolean documentoEmDia = false;
		boolean sobrio = false;
		int opcao = 0;
		
		motorista = JOptionPane.showInputDialog("Nome do motorista?");
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog(motorista + " possui CNH? Digite(0) para não e (1) para Sim"));
		
		if( opcao == 0) {
			cnh = false;
		}
		else {
			cnh = true;
		}
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog( " Documentos estão em dia? Digite(0) para não e (1) para Sim"));
		if( opcao == 0) {
			documentoEmDia = false;
		}
		else {
			documentoEmDia = true;
		}
		opcao = Integer.parseInt(JOptionPane.showInputDialog( " O motorista estava sóbrio? Digite(0) para não e (1) para Sim"));
		if( opcao == 0) {
			sobrio = false;
		}
		else {
			sobrio = true;
		}
		
		if(cnh && documentoEmDia && sobrio) {
			JOptionPane.showMessageDialog(null, motorista + " pode ir embora da blitz");
		}
		else {
			JOptionPane.showMessageDialog(null, "Vode esta detido");
		}
	}

}
