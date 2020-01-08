package oefenopdracht6.opdracht;

import java.util.Locale;

public class Product {

	private double belasting;
	private double prijs;
	private String omschrijving;

	public void setBelasting(double belasting) {
		if (belasting > 0 && belasting <= 100) {
			this.belasting = belasting;
		} else { // belasting voldoet niet aan de eisen
			this.belasting = 0;
		}
	}

	public double getBelasting() {
		return belasting;
	}

	public void setPrijs(double prijs) {
		if (prijs > 0) {
			this.prijs = prijs;
		} else {
			this.prijs = 0;
		}
	}

	public double getPrijs() {
		return prijs;
	}

	public double getPrijsMetBelasting() {
		if (prijs != 0 && belasting != 0) {
			double prijsInclBelasting = prijs * (belasting/100 + 1);
			String temp = String.format(Locale.US, "%.2f", prijsInclBelasting);
			return Double.parseDouble(temp);
		} else {
			return 0;
		}
	}

	public void setOmschrijving(String omschrijving) {
		if (omschrijving.length() > 0) {
			this.omschrijving = omschrijving;
		} else {
			this.omschrijving = "0";
		}
	}

	public String getOmschrijving() {
		return omschrijving;
	}
}