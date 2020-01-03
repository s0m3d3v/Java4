package oefenopdracht6.opdracht;

public class Main {
	public static void main (String[] args){

		Product fiets = new Product("product", "fiets",300.00);
		FactuurRegel regel = new FactuurRegel(fiets, 300, 1);

	}
}
