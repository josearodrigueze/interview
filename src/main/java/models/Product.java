package models;

public class Product {
    private String name;
    private Double price;
    private Integer sellIn;

    Product(String name, Double price, Integer sellIn) {
        this.name = name;
        this.price = price;
        this.sellIn = sellIn;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Double getPrice() {
        return price;
    }

    void setPrice(Double price) {
        this.price = price;
    }

    Integer getSellIn() {
        return sellIn;
    }

    void setSellIn(Integer sellIn) {
        this.sellIn = sellIn;
    }

    @Override
    public String toString() {
        return name + ',' + sellIn + ',' + price;
    }
}
