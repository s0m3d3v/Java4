package oefenopdracht6.opdracht;

public class FactuurRegel extends Product{
	String factuurRegel;

	public void setFactuurRegel(int aantal, Product product) {
		factuurRegel = aantal + " | " + product.getOmschrijving();
	}

	public String getFactuurRegel() {
		return factuurRegel;
	}
}