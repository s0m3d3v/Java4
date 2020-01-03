package oefenopdracht2;

import java.util.Observable;

public class Model extends Observable {
	int counter = 0;

	public Model() {
	}

	public void increase() {
		counter++;

		setChanged();
		notifyObservers();
	}

	public Integer getCounter() {
		return counter;
	}
}