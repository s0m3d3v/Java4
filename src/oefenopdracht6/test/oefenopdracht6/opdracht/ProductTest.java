package oefenopdracht6.opdracht;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

class ProductTest {
	Product product;

	@BeforeEach
	void initObject() {
		product = new Product();
	}

	@Test
	void setBelasting() {
		// Positieve test
		double belasting = 9.01;
		product.setBelasting(belasting);
		assertEquals(belasting, product.getBelasting());
		// Negatieve test, te hoog
		belasting = 100.1;
		product.setBelasting(belasting);
		assertNotEquals(belasting, product.getBelasting());
		assertEquals(0, product.getBelasting());
		// Negatieve test, te laag
		belasting = -1;
		product.setBelasting(belasting);
		assertNotEquals(belasting, product.getBelasting());
		assertEquals(0, product.getBelasting());
	}

	@Test
	void getBelasting() {
		// Positieve test
		int belasting = 9;
		product.setBelasting(belasting);
		assertEquals(belasting, product.getBelasting());
	}

	@Test
	void setPrijs() {
		// Positieve test
		double prijs = 100;
		product.setPrijs(prijs);
		assertEquals(prijs, product.getPrijs());
		product.setBelasting(9); // gebruik belasting voor test
		assertNotEquals(prijs, product.getPrijsMetBelasting());
		// Negatieve test, te laag (lager dan 0)
		prijs = -100;
		product.setPrijs(prijs);
		assertNotEquals(prijs, product.getPrijs());
		assertEquals(0, product.getPrijs());
		// Negatieve test, gelijk aan 0
		prijs = 0;
		product.setPrijs(prijs);
		assertEquals(prijs, product.getPrijs());
	}

	@Test
	void getPrijs() {
		// Positieve test
		int prijs = 100;
		product.setPrijs(100);
		assertEquals(prijs, product.getPrijs());
	}

	@Test
	void getPrijsMetBelasting() {
		// Positieve test
		double prijs = 100;
		double belasting = 9;
		double verwachteUitkomst = prijs * (belasting/100 + 1); // bereken belasting

		product.setBelasting(belasting);
		product.setPrijs(prijs);
		String temp = String.format(Locale.US, "%.2f", verwachteUitkomst); // zorg dat het getal 2 decimalen heeft
		verwachteUitkomst = Double.parseDouble(temp);
		assertEquals(verwachteUitkomst, product.getPrijsMetBelasting());
		// Negatieve test
		prijs = 100;
		belasting = -1;
		verwachteUitkomst = prijs * (belasting/100 + 1);
		product.setBelasting(belasting);
		product.setPrijs(prijs);
		assertNotEquals(verwachteUitkomst, product.getPrijsMetBelasting());
		// Negatieve test
		prijs = 100;
		belasting = 101;
		verwachteUitkomst = prijs * (belasting/100 + 1);
		product.setBelasting(belasting);
		product.setPrijs(prijs);
		assertNotEquals(verwachteUitkomst, product.getPrijsMetBelasting());
		// Negatieve test
		prijs = -1;
		belasting = 9;
		verwachteUitkomst = prijs * (belasting/100 + 1);
		product.setBelasting(belasting);
		product.setPrijs(prijs);
		assertNotEquals(verwachteUitkomst, product.getPrijsMetBelasting());
	}

	@Test
	void setOmschrijvijng() {
		// Positieve test
		String omschrijving = "Dit is een omschrijving.";
		product.setOmschrijving(omschrijving);
		assertEquals(omschrijving, product.getOmschrijving());
		// Negatieve test
		omschrijving = "";
		product.setOmschrijving(omschrijving);
		assertNotEquals(omschrijving, product.getOmschrijving());
		assertEquals("0", product.getOmschrijving());
	}

	@Test
	void getOmschrijving() {
		// Positieve test
		String omschrijving = "Dit is een omschrijving.";
		product.setOmschrijving(omschrijving);
		assertEquals(omschrijving, product.getOmschrijving());
	}
}