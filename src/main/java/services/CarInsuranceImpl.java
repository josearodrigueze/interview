package services;

import models.Product;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CarInsuranceImpl extends CarInsurance {
    public CarInsuranceImpl(List<Product> products) {
        super(products);
    }

    @Override
    public List<Product> updatePrice() {
        final List<Product> products = getProducts()
                .stream()
                .map(applyRule())
                .collect(Collectors.toList());

        this.setProducts(products);
        return this.getProducts();
    }

    private Function<Product, Product> applyRule() {
        return prod -> {

            Integer sellIn = prod.getSellIn();
            sellIn--;

            prod.setSellIn(sellIn);

            Integer price = prod.getPrice();
            price--;

            prod.setPrice(price);
            return prod;
        };
    }
}
