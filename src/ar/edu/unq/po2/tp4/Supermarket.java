package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermarket {

	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private String address;
	private List<Product> products;

	public Supermarket(String marketName, String marketAddress) {
		name = marketName;
		address = marketAddress;
		products = new ArrayList<>();
	}

	public Integer productsSize() {
		return products.size();
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public Double totalPrice() {
		return products.stream().mapToDouble(Product::price).sum();
	}

}
