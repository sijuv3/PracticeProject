package demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {
    @Test
    public void isEven() {
        Demo d = new Demo();
        Assertions.assertTrue(d.isEven(6));
    }

    @Test
    public void isOdd() {
        Demo d = new Demo();
        Assertions.assertFalse(d.isEven(5));
    }

    @Test
    public void isSame() {
        Demo d = new Demo();
        Assertions.assertEquals(9, d.isGood());
    }

    /*@Test
    @DisplayName("Should not be empty")
    public void isEvenNum() {
        Demo d = new Demo();
        Assertions.assertThrows(RuntimeException.class, () -> {
            d.isEven(0);
        });
    }*/

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    public void shouldTest(int n) {
        Demo d = new Demo();
        Assertions.assertTrue(d.isEven(n));
    }

    @ParameterizedTest
    @ValueSource(strings = {"2", "2", "4694695678"})
    public void isValidPh(String s) {
        Demo d = new Demo();
        Assertions.assertTrue(d.validatePhoneNum(s));
    }
}