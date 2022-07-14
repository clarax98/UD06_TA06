package TA06_04;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, pedirNumero(Integer.parseInt(JOptionPane.showInputDialog("Introduce el número"))));
	}
	
	public static String pedirNumero(int numero) {
		return "El factorial es: " + nFactorial(numero);
	}

	private static long nFactorial(int numero) {
		long factorial = numero;
		for (int i=1; i < numero; i++) {
			factorial *= numero - i; 
		}
		return factorial;
	}

}
