import java.util.*;

public abstract class Product {
	private ArrayList<String> name = new ArrayList();
	private ArrayList<String> color = new ArrayList();
	private ArrayList<Double> price = new ArrayList();

	public int size() {
		return this.name.size();
	}

	// setters
	public void setName(String name) {
		this.name.add(name);
	}

	public void setColor(String color) {
		this.color.add(color);
	}

	public void setPrice(double price) {
		this.price.add(price);
	}

	// getters
	public String getName(int key) {
		return this.name.get(key);
	}

	public String getColor(int key) {
		return this.color.get(key);
	}

	public double getPrice(int key) {
		return this.price.get(key);
	}

	public void remove(int rowToDelete) {
		this.name.remove(rowToDelete);
		this.color.remove(rowToDelete);
		this.price.remove(rowToDelete);
	}

	abstract double total();
}
