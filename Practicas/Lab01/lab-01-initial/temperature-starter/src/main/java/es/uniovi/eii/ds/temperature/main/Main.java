package es.uniovi.eii.ds.temperature.main;

public class Main {
    public static void main(String[] args) {
		//double[] temperatures = new double[100];
		Temperature[] temperatures = new Temperature[100];

		// Data acquisition
		for (int i = 0; i < temperatures.length; i++) {
			//temperatures[i] = readTemperatureSensor();
			temperatures[i] = new Temperature();
			temperatures[i].setCelsius(readTemperatureSensor());

		}

		// Calculate the average temperature in Celsius
		double averageCelsius = 0;
		for (int i = 0; i < temperatures.length; i++) {
			//averageCelsius += temperatures[i];
			averageCelsius += temperatures[i].getCelsius();
		}
		averageCelsius = averageCelsius / temperatures.length;
		System.out.printf("The average temperature in Celsius is: %.1f °C%n", averageCelsius);

		// Calculate the average temperature in Fahrenheit
		double averageFahrenheit = 0;
		for (int i = 0; i < temperatures.length; i++) {
			//averageFahrenheit += temperatures[i] * 9 / 5 + 32;
			averageFahrenheit += temperatures[i].getFahrenheit();
		}
		averageFahrenheit = averageFahrenheit / temperatures.length;
		System.out.printf("The average temperature in Fahrenheit is: %.1f °F%n", averageFahrenheit);

		// Calculate the variance in Fahrenheit
		double varianceFahrenheit = 0;
		for (int i = 0; i < temperatures.length; i++) {
			//varianceFahrenheit += Math.pow(temperatures[i] * 9 / 5 + 32 - averageFahrenheit, 2);
			varianceFahrenheit += Math.pow(temperatures[i].getFahrenheit() - averageFahrenheit, 2);
		}
		varianceFahrenheit = varianceFahrenheit / temperatures.length;
		System.out.printf("The variance in Fahrenheit is: %.1f%n", varianceFahrenheit);
	}

	// Simulates the reading of a temperature sensor in Celsius
	public static double readTemperatureSensor() {
		return Math.random() * 30;
	}
}