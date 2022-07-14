package TA06_03;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, pedirNumero(Integer.parseInt(JOptionPane.showInputDialog("Introduce el número"))));
	}
	
	public static String pedirNumero(int numero) {
		if (cPrimo(numero)) {
			return "El número: " + numero + " es primo.";
		} 
		return "El número: " + numero + " no es primo.";
	}

	private static boolean cPrimo(int numero) {
		  if (numero == 0 || numero == 1 || numero == 4) {
		    return false;
		  }
		  for (int y = 2; y < numero / 2; y++) {
		    if (numero % y == 0) {
		      return false;
		    }
		  }
		  return true;
	}

}
