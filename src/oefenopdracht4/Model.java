package oefenopdracht4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Model {
	String[] intArray = { "Kevin", "Jesper", "Jeffrey", "Dylan", "Pascal" };

	public void Shuffle() {
		List<String> intList = Arrays.asList(intArray);
		Collections.shuffle(intList);
		intList.toArray(intArray);
	}
	public String getName() {
		return intArray[0];
	}
}