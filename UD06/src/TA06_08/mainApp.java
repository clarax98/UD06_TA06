package TA06_08;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, arrC());
	}
	
	private static String arrC() {
		String msj = "";
		int valores[] = new int[10];
		for(int i = 0; i <= valores.length - 1; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
			msj += "(" + i + ") => " + valores[i] + " ";
		}
		return msj;
	}

}
