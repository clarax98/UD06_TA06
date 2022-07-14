package TA06_05;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, pedirNumero(Integer.parseInt(JOptionPane.showInputDialog("Introduce el número para parsear a bin"))));
	}
	
	public static String pedirNumero(int numero) {
		return dec2Bin(numero);
	}

	
	public static String dec2Bin(int numero) {
		return Integer.toBinaryString(numero);	
	}
}
