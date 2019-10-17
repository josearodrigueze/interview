package models;

import java.util.Objects;

public class Product {
    private String name;
    private Integer price;
    private Integer sellIn;
    private Rule rule;

    public Product(String name, Integer price, Integer sellIn) {
        this.name = name;
        this.price = price;
        this.sellIn = sellIn;
    }

    public Product(String name, Integer price, Integer sellIn, Rule rule) {
        this.name = name;
        this.price = price;
        this.sellIn = sellIn;
        this.rule = rule;
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

    public Rule getRule() {
        return rule;
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
}
