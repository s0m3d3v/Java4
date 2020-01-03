package oefenopdracht6.opdracht;

public class Fiets extends Product {

	public Fiets(Product fiets, String omschrijving, Double prijs) {
		super(prijs, omschrijving, prijs);
		omschrijving = "Nederlanders houden van fietsen";
		prijs = 114.70;
	}
}