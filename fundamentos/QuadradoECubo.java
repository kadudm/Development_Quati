package fundamentos;

import javax.swing.JOptionPane;

public class QuadradoECubo {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Insira o valor para ser calculado ao quadrado e ao cubo");
		
		double valorInt = Integer.parseInt(valor);
		
		double valorQuadrado = Math.pow(valorInt, 2);
		double valorCubo = Math.pow(valorInt, 3);
		
		System.out.println(valorQuadrado);
		System.out.println(valorCubo);
	}

}
