package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RuleTest {
    private Rule rule;

    @Test
    void instantiable() {
        //SUT
        rule = new Rule();

        //asserts
        assertNotNull(rule);
    }


}