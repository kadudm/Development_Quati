package fundamentos;

import javax.swing.JOptionPane;

public class ConversionFahrenheitToCelsius {
	public static void main(String[] args) {
		
		String fahrenheit = JOptionPane.showInputDialog("Informe a temperatura em Fahrenheit");
		double fahrenheitToD = Double.parseDouble(fahrenheit);
		
		double celsius = (fahrenheitToD - 32) / 1.8;
		System.out.println(celsius);
		
		
	}

}
