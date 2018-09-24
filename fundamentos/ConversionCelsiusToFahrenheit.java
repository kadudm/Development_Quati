package fundamentos;

import javax.swing.JOptionPane;

public class ConversionCelsiusToFahrenheit {
	public static void main(String[] args) {
		String celsius = JOptionPane.showInputDialog("Informe a Temperatura em Celsius");
		double celsiusToD = Double.parseDouble(celsius);
		
		double fahrenheit = (celsiusToD / 5) * 9 + 32;
		
		System.out.println(fahrenheit);
		
		
	}

}
