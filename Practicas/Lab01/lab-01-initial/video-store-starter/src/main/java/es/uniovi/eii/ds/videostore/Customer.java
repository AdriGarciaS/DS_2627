package es.uniovi.eii.ds.videostore;

import java.util.*;

import static es.uniovi.eii.ds.videostore.Movie.PriceCode.*;

public class Customer {

	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

		for (Rental each : rentals) {
			frequentRenterPoints += each.getFrequentRenterPoints();

			// Shows the amount for each rental
			result.append("\t" + each.getMovie().getTitle() + "\t" + each.getAmount() +
					"\n");
			totalAmount += each.getAmount();
		}

		// Adds footer lines with total amount and frequent renter points
		result.append("Amount owed is " + totalAmount + "\n");
		result.append("You earned " + frequentRenterPoints + " frequent renter points");

		return result.toString();
	}



}
