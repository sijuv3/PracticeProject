package demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    public void isEven() {
        assertTrue(new Demo().isEven(6));
    }

    @Test
    public void isOdd() {
        Demo d = new Demo();
        assertFalse(d.isEven(5));
    }

    @Test
    @DisplayName("Test Case for Same")
    public void isSame() {
        Demo d = new Demo();
        assertEquals(9, d.isGood());
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
        assertTrue(d.isEven(n));
    }

    @ParameterizedTest
    @ValueSource(strings = {"2", "2", "4694695678"})
    public void isValidPh(String s) {
        Demo d = new Demo();
        assertTrue(d.validatePhoneNum(s));
    }

    @Test
    @Disabled
    public void isEvenDisabled() {
        Demo d = new Demo();
        assertTrue(d.isEven(6));
    }
}