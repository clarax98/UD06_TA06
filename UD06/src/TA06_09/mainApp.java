package TA06_09;

import java.util.Random;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, pedirNumero(Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del arr"))));
	}
	
	public static String pedirNumero(int numero) {
		return cArr(numero);
	}

	
	public static String cArr(int numero) {
		Random ran = new Random();
		String msj = "";
		
		int[] arr = new int[numero];
		int total = 0;
		for (int i = 0; i <= numero - 1; i++) {
			arr[i] = ran.nextInt(9 - 0) + 0;
			total += arr[i];
			msj += i + " : " + arr[i] + " - ";
		}
		
		msj += "|| Total: " + total;
		
		return msj;
	}

}
