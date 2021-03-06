package nonapi.io.github.classgraph.json;

import org.junit.jupiter.api.Test;

import nonapi.io.github.classgraph.types.ParseException;

/**
 * Unit test.
 */
public class JSONParserTest {
    /**
     * Test double value.
     *
     * @throws ParseException
     *             the parse exception
     */
    @Test
    public void test1() throws ParseException {
        JSONParser.parseJSON("{\"doubleValue\":-2.147483648}");
    }

    /**
     * Test double value with exponent.
     *
     * @throws ParseException
     *             the parse exception
     */
    @Test
    public void test2() throws ParseException {
        JSONParser.parseJSON("{\"doubleValue\":-2.147483648E9}");
    }
}