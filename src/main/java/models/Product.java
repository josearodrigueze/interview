package models;

import java.util.Objects;

public class Product {
    protected String name;
    protected Integer price;
    protected Integer sellIn;

    public Product(String name, Integer price, Integer sellIn) {
        this.name = name;
        this.price = price;
        this.sellIn = sellIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSellIn() {
        return sellIn;
    }

    public void setSellIn(Integer sellIn) {
        this.sellIn = sellIn;
    }

    @Override
    public String toString() {
        return name + ", " + sellIn + ", " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(price, product.price) &&
                Objects.equals(sellIn, product.sellIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, sellIn);
    }

    public Product updatePrice() {
        sellIn--;
        price--;

        if (sellIn < 0) {
            price--;
        }

        return this;
    }
}
