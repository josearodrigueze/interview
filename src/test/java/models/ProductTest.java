package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product;

    @Test
    void runProduct() {
        product = new Product("name", 10.0, 10);
        System.out.println("product = " + product);
    }
}