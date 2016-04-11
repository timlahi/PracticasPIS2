package capitulo1;



import org.junit.Test;


import junit.framework.TestCase;


public class TestR extends TestCase {

	   /*@Test
	   public void test() {
	       Movie movie1 = new Movie("Monty Python and the Holy Grail", 0);
	       Movie movie2 = new Movie("Ice Age", 2);

	       Customer yo = new Customer("Isa");
	       Rental r1= new Rental(movie1, 10);
	       Rental r2= new Rental(movie2, 2);

	       yo.addRental(r1);
	       yo.addRental(r2);

	       String res = "Rental Record for "+"Isa"+"\n"+"   Monty Python and the Holy Grail 14.0"+"\n"+"   Ice Age 1.5"+"\n"+
	       "Amount owed is 15.5"+"\n"+"You earned 2 frequent renter points";
	       String mio = yo.statement();
	       assertEquals(res,mio);*/
	
	@Test
	public void test() {
		Movie movie1 = new Movie("Monty Python and the Holy Grail", 0);
		Movie movie2 = new Movie("Ice Age", 2);
		Movie movie3 = new Movie("Batman vs Superman", 1);
		Movie movie4 = new Movie("Rey Leon", 2);
		Movie movie5 = new Movie("Resucitado", 0);
		

		Customer yo = new Customer("Miguel");
		Rental r1 = new Rental(movie1, 10);
		Rental r2 = new Rental(movie2, 2);
		Rental r3 = new Rental(movie3, 1);
		Rental r4 = new Rental(movie4, 10);
		Rental r5 = new Rental(movie5, 10);
		
		movie5.setPriceCode(1);
		yo.addRental(r1);
		yo.addRental(r2);
		yo.addRental(r3);
		yo.addRental(r4);
		yo.addRental(r5);

		String res = "Rental Record for " + "Miguel" + 
					"\n" + "\t" + "Monty Python and the Holy Grail 14.0" +
					"\n" + "\t" + "Ice Age 1.5" + 
					"\n" + "\t" + "Batman vs Superman 3.0" +
					"\n" + "\t" + "Rey Leon 12.0" +
					"\n" + "\t" + "Resucitado 30.0" +
					"\n" + "Amount owed is 60.5" +
					"\n" + "You earned 6.0 frequent renter points";

		assertEquals(res, yo.statement());
	
}
}
