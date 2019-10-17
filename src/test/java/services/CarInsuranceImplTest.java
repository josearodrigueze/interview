package services;

import models.Product;
import models.Rule;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarInsuranceImplTest {
    @Test
    void given_a_product_to_update() {
        final List<Product> products = new ArrayList<>();
        products.add(new Product("Full Coverage", 2, 0));

        //SUT
        final List<Product> result = new CarInsuranceImpl(products).updatePrice();

        //asserts
        assertThat(result.size(), is(1));
        assertThat(result.get(0), is(new Product("Full Coverage", 1, -1)));

    }
}