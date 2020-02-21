package com.karetis.parsers;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MandatoryTests {

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
        values.put("int_07", 6);
    }

    @Test
    void trueLiteral() {
        String test = "(true)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(true, result);
    }

    @Test
    void falseLiteral() {
        String test = "(false)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(false, result);
    }

    @Test
    void variable() {
        String test = "(bool_f)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(false, result);
    }

    @Test
    void not01() {
        String test = "(!bool_f)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(true, result);
    }

    @Test
    void not02() {
        String test = "(!bool_t)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(false, result);
    }

    @Test
    void and01() {
        String test = "(bool_f && true)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(false, result);
    }

    @Test
    void and02() {
        String test = "(bool_t && true)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(true, result);
    }

    @Test
    void and03() {
        String test = "(bool_t && bool_f)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(false, result);
    }

    @Test
    void or01() {
        String test = "(bool_f || true)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(true, result);
    }

    @Test
    void or02() {
        String test = "(bool_f || false)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(false, result);
    }

    @Test
    void or03() {
        String test = "(bool_t || bool_f)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(true, result);
    }

    @Test
    void equals01() {
        String test = "(int_01 == 1)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(true, result);
    }

    @Test
    void equals02() {
        String test = "(int_01 == int_02)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(false, result);
    }

    @Test
    void notEquals01() {
        String test = "(int_01 != 1)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(false, result);
    }

    @Test
    void notEquals02() {
        String test = "(int_01 != int_02)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(true, result);
    }

    @Test
    void greaterThan01() {
        String test = "(int_02 > 1)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(true, result);
    }

    @Test
    void greaterThan02() {
        String test = "(int_02 > int_03)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(false, result);
    }

    @Test
    void greaterThan03() {
        String test = "(int_02 > int_02)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(false, result);
    }

    @Test
    void greaterThanEquals01() {
        String test = "(int_02 >= 1)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(true, result);
    }

    @Test
    void greaterThanEquals02() {
        String test = "(int_02 >= int_03)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(false, result);
    }

    @Test
    void greaterThanEquals03() {
        String test = "(int_02 >= int_02)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(true, result);
    }

    @Test
    void lessThan01() {
        String test = "(int_02 < 1)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(false, result);
    }

    @Test
    void lessThan02() {
        String test = "(int_02 < int_03)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(true, result);
    }

    @Test
    void lessThan03() {
        String test = "(int_02 < int_02)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(false, result);
    }

    @Test
    void lessThanEquals01() {
        String test = "(int_02 <= 1)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(false, result);
    }

    @Test
    void lessThanEquals02() {
        String test = "(int_02 <= int_03)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(true, result);
    }

    @Test
    void lessThanEquals03() {
        String test = "(int_02 <= int_02)";

        Object result = Parsers.execute(test, values);
        Assertions.assertNotNull(result);

        Assertions.assertEquals(true, result);
    }
}
