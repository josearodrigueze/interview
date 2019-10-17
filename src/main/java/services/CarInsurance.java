package services;

import models.Product;

import java.util.List;

public abstract class CarInsurance {
    private List<Product> products;

    public CarInsurance(List<Product> products) {
        this.products = products;
    }

    public abstract List<Product> updatePrice();

    List<Product> getProducts() {
        return products;
    }

    protected void setProducts(List<Product> products) {
        this.products = products;
    }
}
