package com.karetis.parsers;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OptionalTests {

    // Double comparison precision
    final double threshold = 0.0000001;

    Map<String, Object> values;

    @BeforeAll
    void beforeAll() {
        values = new HashMap<>();

        values.put("bool_f", false);
        values.put("bool_t", true);

        values.put("int_01", 1);
        values.put("int_02", 2);
        values.put("int_03", 3);
        values.put("int_04", 4);
        values.put("int_05", 5);
        values.put("int_06", 6);
        values.put("int_07", 7);
    }

    @Test
    void add() {
        String test = "((int_01 + int_02) == int_03)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(true, result);
    }

    @Test
    void subtract() {
        String test = "((int_03 - int_02) == int_01)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(true, result);
    }

    @Test
    void divide() {
        String test = "((int_06 / int_02) == int_03)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(true, result);
    }

    @Test
    void multiply() {
        String test = "((int_02 * int_03) == int_06)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(true, result);
    }

    @Test
    void remainder() {
        String test = "((int_03 % int_02) == int_01)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(true, result);
    }

}
