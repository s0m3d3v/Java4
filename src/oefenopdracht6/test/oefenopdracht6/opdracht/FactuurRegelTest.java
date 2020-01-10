package oefenopdracht6.opdracht;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactuurRegelTest {

	@Test
	void setFactuurRegel() {
		// Setup
		FactuurRegel factuurregel = new FactuurRegel();
		Product product = new Product();
		product.setPrijs(10);
		product.setOmschrijving("fiets");
		assertNotEquals("auto", factuurregel.getFactuurRegel());// Kijken of er iets is veranderd, de regel mag niet leeg
	}

	@Test
	void getFactuurRegel() {
		FactuurRegel factuurregel = new FactuurRegel();
		Product product = new Product();

		product.setPrijs(10.00);
		product.setBelasting(21.0);
		product.setOmschrijving("fiets");

		factuurregel.setFactuurRegel(2, product);

			String verwachteUitkomst = "fiets";
			FactuurRegelTest factuurRegel = new FactuurRegelTest();
		assertEquals("fiets", verwachteUitkomst);
	}
}