package oefenopdracht6.opdracht;

public class FactuurRegel{
	String factuurRegel;

	public void setFactuurRegel(int aantal, Product product) {
		factuurRegel = aantal + " | " + product.getOmschrijving() +
				"\nPer stuk: €" + product.getPrijs() +
				" Excl. BTW (" + product.getBelasting() +
				")" + "\nTotaal: €" + product.getPrijs() * aantal * (product.getBelasting()/100 + 1) +
				" Incl. BTW (" + product.getBelasting() + ")";
	}

	public String getFactuurRegel() {
		return factuurRegel;
	}
}