package fundamentos;

import javax.swing.JOptionPane;

public class IMC {
	public static void main(String[] args) {
		String peso = JOptionPane.showInputDialog("Insira o peso");
		String altura = JOptionPane.showInputDialog("Insira a altura");
		
		double pesoToDouble = Double.parseDouble(peso);
		double alturaToDouble = Double.parseDouble(altura);
		
		double imc = pesoToDouble / (Math.pow(alturaToDouble, 2));
		
		System.out.println(imc);
		
	}

}
