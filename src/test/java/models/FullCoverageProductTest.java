package models;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FullCoverageProductTest {
    @Test
    void when_sellIn_is_positive_and_price_is_less_that_50() {
        //behavior
        final FullCoverageProduct fullCoverageProduct = new FullCoverageProduct("name", 10, 10);

        //SUT
        fullCoverageProduct.updatePrice();

        //asserts
        assertThat(fullCoverageProduct, is(new FullCoverageProduct("name", 11, 9)));
    }

    @Test
    void when_sellIn_is_positive_and_price_is_50() {
        //behavior
        final FullCoverageProduct fullCoverageProduct = new FullCoverageProduct("name", 50, 10);

        //SUT
        fullCoverageProduct.updatePrice();

        //asserts
        assertThat(fullCoverageProduct, is(new FullCoverageProduct("name", 50, 9)));
    }

    @Test
    void when_sellIn_is_zero_and_price_is_50() {
        //behavior
        final FullCoverageProduct fullCoverageProduct = new FullCoverageProduct("name", 50, 0);

        //SUT
        fullCoverageProduct.updatePrice();

        //asserts
        assertThat(fullCoverageProduct, is(new FullCoverageProduct("name", 48, -1)));
    }
}