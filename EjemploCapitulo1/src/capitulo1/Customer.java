package capitulo1;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
	private String _name;
	private Vector _rentals = new Vector();

	public Customer(String name) {
		_name = name;
	};

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public String getName() {
		return _name;
	};

	/*
	 * public String statement() { double totalAmount = 0; int
	 * frequentRenterPoints = 0; Enumeration rentals = _rentals.elements();
	 * String result = "Rental Record for " + getName() + "\n"; while
	 * (rentals.hasMoreElements()) { double thisAmount = 0; Rental each =
	 * (Rental) rentals.nextElement();
	 * 
	 * thisAmount = each.getCharge(); // 1-aqui lo que se hace es pasar el //
	 * c�digo a otro m�todo que se va a llamar amountfor(Rental each)
	 * 
	 * // determine amounts for each line /* switch
	 * (each.getMovie().getPriceCode()) { case Movie.REGULAR: thisAmount += 2;
	 * if (each.getDaysRented() > 2) thisAmount += (each.getDaysRented() - 2) *
	 * 1.5; break; case Movie.NEW_RELEASE: thisAmount += each.getDaysRented() *
	 * 3; break; case Movie.CHILDRENS: thisAmount += 1.5; if
	 * (each.getDaysRented() > 3) thisAmount += (each.getDaysRented() - 3) *
	 * 1.5; break; }
	 */

	// add frequent renter points
	/*
	 * frequentRenterPoints++; // add bonus for a two day new release rental if
	 * ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
	 * each.getDaysRented() > 1) frequentRenterPoints++; // show figures for
	 * this rental result += "\t" + each.getMovie().getTitle() + "\t" +
	 * String.valueOf(thisAmount) + "\n"; totalAmount += thisAmount; } // add
	 * footer lines result += "Amount owed is " + String.valueOf(totalAmount) +
	 * "\n"; result += "You earned " + String.valueOf(frequentRenterPoints) +
	 * " frequent renter points"; return result; }
	 * 
	 * // Este es el nuevo m�todo que se ha creado, // al pasar las pruebas por
	 * primera vez los test fallaban porque al generar // el nueno m�todo
	 * devolv�a entero en vez de double //Hemos refactorizado las variables
	 * /*private double amountFor(Rental aRental) { return aRental.getCharge();
	 * }
	 */

	public String statement() {
		double frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			frequentRenterPoints += each.getFrequentRenterPoints();
			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + " "
					+ String.valueOf(each.getCharge()) + "\n";
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints)
				+ " frequent renter points";
		return result;
	}

	private double getTotalCharge() {
		double result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}

	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;

	}
}