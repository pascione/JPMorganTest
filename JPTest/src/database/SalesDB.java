package database;

import java.util.ArrayList;
import java.util.List;

public class SalesDB<T> {
	private List<T> listOfSales;

	public SalesDB() {
		listOfSales = new ArrayList<T>();
	}

	// All sales must be recorded
	public void addSale(T message) {
		try {
			listOfSales.add(message);
		} catch (Exception e) {

		}
	}

}
