package fundamentos;

import javax.swing.JOptionPane;

public class AreaTriangulo {
	public static void main(String[] args) {
		String valorBase = JOptionPane.showInputDialog("Insira o valor da base do tri�ngulo");
		String valorAltura = JOptionPane.showInputDialog("Insira o valor da altura do ti�ngulo");
		
		double baseToDouble = Double.parseDouble(valorBase);
		double alturaToDouble = Double.parseDouble(valorAltura);
		
		double area = baseToDouble * alturaToDouble / 2;
		
		System.out.println(area);
		
	}

}
