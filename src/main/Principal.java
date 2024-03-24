package main;

import javax.swing.JOptionPane;

import model.Circulo;

public class Principal {
	public static void main(String[] args) {
		double  x = Double.parseDouble(JOptionPane.showInputDialog("digite um numero"));
		
		Circulo c = new Circulo(x);

		System.out.println("o perimetro total é " + c.getPerimetro());
		System.out.println("a area total é " + c.getArea());
	}

}
