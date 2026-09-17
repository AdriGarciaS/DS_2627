package es.uniovi.eii.ds.videostore;

import static es.uniovi.eii.ds.videostore.Movie.PriceCode.NEW_RELEASE;

public class Movie {

	public double getCharge(int daysRented) {
		double amount = 0 ;
		switch (getPriceCode()) {
			case REGULAR -> {
				amount += 2;
				if (daysRented > 2)
					amount += (daysRented - 2) * 1.5;
			}
			case NEW_RELEASE -> {
				amount += daysRented * 3;
			}
			case CHILDRENS -> {
				amount += 1.5;
				if (daysRented > 3)
					amount += (daysRented - 3) * 1.5;
			}
		}

		return amount;
	}

	public int getFrequentRenterPoints(int daysRented) {
		int points = 1;

		// Adds frequent renter points
		points++;
		// An extra point for new release movies rented for more than 1 day
		if ((getPriceCode() == NEW_RELEASE) && daysRented > 1)
			points++;
		return points;
	}

	public enum PriceCode {
		REGULAR, NEW_RELEASE, CHILDRENS
	}
	
	private String title;
	private PriceCode priceCode;

	public Movie(String title, PriceCode priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}
	
	public PriceCode getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(PriceCode priceCode) {
		this.priceCode = priceCode;
	}
	
	public String getTitle() {
		return title;
	}	
}
