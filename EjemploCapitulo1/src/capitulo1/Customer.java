package capitulo1;

import java.util.ArrayList;
import java.util.Iterator;


class Customer {
	private String name;
	private ArrayList<Rental> rentals = new ArrayList<>();

	public Customer(String string) {
		this.name = string;
	};

	public void addRental(Rental arg) {
		rentals.add(arg);
	}

	public String getName() {
		return name;
	};


	public String statement() {
		double frequentRenterPoints = 0;
		Iterator<Rental> alquiler = this.rentals.iterator();
		String result = "Rental Record for " + getName() + "\n";
		while (alquiler.hasNext()) {
			Rental each = alquiler.next();
			frequentRenterPoints += each.getFrequentRenterPoints();
			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + " "
					+each.getCharge() + "\n";
		}
		// add footer lines
		result += "Amount owed is " + getTotalCharge() + "\n";
		result += "You earned " + frequentRenterPoints
				+ " frequent renter points";
		return result;
	}

	private double getTotalCharge() {
		double result = 0;
		Iterator<Rental> alquiler = this.rentals.iterator();
		while (alquiler.hasNext()) {
			Rental each = alquiler.next();
			result += each.getCharge();
		}
		return result;
	}

	
}


