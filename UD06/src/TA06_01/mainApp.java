package TA06_01;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opcion = "0";
		do {
			opcion = JOptionPane.showInputDialog("1.Area Circulo, 2.Area Triangulo, 3.Area Cuadrado");
		} while (opcion.isEmpty());
		
		switch (opcion) {
			case "1":
				alert(aCirculo(Double.parseDouble(JOptionPane.showInputDialog("Introduce el Radio"))));
				break;
				
			case "2":
				alert(aTriangulo(Double.parseDouble(JOptionPane.showInputDialog("Introduce la base")), Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura")) ));
				break;
				
			case "3":
				alert(aCuadrado(Double.parseDouble(JOptionPane.showInputDialog("Introduce la lado")) ));
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "No valido");
				break;
		}		
	}
	
	public static void alert(double r) {
		JOptionPane.showMessageDialog(null, "Area: "+r);
	}
	
	public static double aCirculo(double r) {
		return (Math.PI * Math.pow(r, 2));
	}
	
	public static double aTriangulo(double n1, double n2) {
			return (n1 * n2)/2;
		}
	
	public static double aCuadrado(double n1) {
		return n1*n1;
	}

}
