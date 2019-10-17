package models;

public class FullCoverageProduct extends Product {
    public FullCoverageProduct(String name, Integer price, Integer sellIn) {
        super(name, price, sellIn);
    }

    @Override
    public Product updatePrice() {
        if (sellIn <= 0) {
            return super.updatePrice();
        }
        sellIn--;

        if (price < 50) {
            price++;
        }
        return this;
    }
}
