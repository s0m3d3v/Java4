package oefenopdracht5;

import oefenopdracht5.opdracht.Btw;
import org.junit.jupiter.api.Test;

class BtwTest {

	@Test
	void test() {
		// Arrange
		Btw test = new Btw();
		test.setBtw(19);
		test.setPrijs(100);
		int expected = 119;

		// Act
		double resultaat = test.getPrijsInclusiefBtw();

		// Assert
		assert (resultaat == expected);
	}
}