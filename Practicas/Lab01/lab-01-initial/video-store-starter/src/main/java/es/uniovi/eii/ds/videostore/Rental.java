package es.uniovi.eii.ds.videostore;

import static es.uniovi.eii.ds.videostore.Movie.PriceCode.NEW_RELEASE;

// Represents a rental of a movie by a customer.
public class Rental  {
	
	private Movie movie;
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public double getAmount() {
		return movie.getCharge(getDaysRented());
	}

	public int getFrequentRenterPoints() {
		return movie.getFrequentRenterPoints(getFrequentRenterPoints());


	}

	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}
}
