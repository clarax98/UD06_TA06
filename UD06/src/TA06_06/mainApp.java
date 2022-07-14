package TA06_06;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, pedirNumero(JOptionPane.showInputDialog("Introduce el número")));
	}
	
	public static int pedirNumero(String numero) {
		try {
			if(Integer.parseInt(numero)>0) {
				return nCifras(numero);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Numero no valido");
		}
		return -1;
	}

	public static int nCifras(String numero) {
		return numero.length(); 
	}
}
