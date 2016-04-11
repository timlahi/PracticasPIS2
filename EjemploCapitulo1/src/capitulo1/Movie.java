package capitulo1;

public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String title;
	private int priceCode;

	public Movie(String string1, int string2) {
		this.title = string1;
		this.priceCode = string2;
	}

	public int getPriceCode() {
		return this.priceCode;
	}

	public void setPriceCode(int arg) {
		this.priceCode = arg;
	}

	public String getTitle() {
		return title;
	};
}
