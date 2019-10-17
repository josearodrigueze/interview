package services;

import models.Product;
import models.Rule;

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

    Function<Product, Product> applyRule() {
        return prod -> {

            Integer sellIn = prod.getSellIn();
            sellIn--;

            prod.setSellIn(sellIn);

            Integer price = prod.getPrice();
            if("Full Coverage".equalsIgnoreCase(prod.getName())){
                price++;
            } else{
                price--;

                if (sellIn < 0) {
                    price--;
                }
            }

            prod.setPrice(price);
            return prod;
        };
    }
}
