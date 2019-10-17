package models;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

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

}