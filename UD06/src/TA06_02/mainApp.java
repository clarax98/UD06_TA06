package TA06_02;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cNumeros , cMax , cMin ;
		do {
			cNumeros = JOptionPane.showInputDialog("Cantidad de numeros a generar");
		} while (cNumeros.isEmpty());
		do {
			cMax = JOptionPane.showInputDialog("Numero Maximo");
		} while (cMax.isEmpty());
		do {
			cMin = JOptionPane.showInputDialog("Numero minimo");
		} while (cMin.isEmpty());
		
		for (int i = 1; i <= Integer.parseInt(cNumeros); i++) {
			JOptionPane.showMessageDialog(null, genNumeros(Integer.parseInt(cMax), Integer.parseInt(cMin)));
		}
		
	}
	public static int genNumeros(int cMax, int CMin) {
		return (int) (Math.random() * ( cMax - CMin ));	
	}
}
