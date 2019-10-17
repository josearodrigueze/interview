package models;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void print() {
        // SUT
        final Product product = new Product("name", 10, 10);

        //asserts
        assertThat(product.toString(), is("name, 10, 10"));
    }

    @Test
    void updatePrice_given_a_positive_sellIn() {
        //SUT
        final Product product = new Product("name", 1, 1);
        product.updatePrice();

        //asserts
        assertThat(product.getSellIn(), is(0));
        assertThat(product.getPrice(), is(0));
    }

    @Test
    void updatePrice_when_sellIn_is_zero() {
        final Product product = new Product("name", 2, 0);

        //SUT
        product.updatePrice();

        //asserts
        assertThat(product.getSellIn(), is(-1));
        assertThat(product.getPrice(), is(0));
    }

    @Test
    void product_hashCode() {
        //behavior
        final Product product = new Product("name", 2, 0);

        //SUT
        final int code = product.hashCode();

        //asserts
        assertThat(code, is(Objects.hash("name", 2, 0)));
    }
}