package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.efes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


public class testovv {

    private efes calculator;

    @BeforeEach
    public void setUp() throws Exception {
        calculator = new efes();
    }
asd
    @Test
    @DisplayName("Simple multiplication should work")
    public void testMultiply() {
        assertEquals(20, calculator.efe(4,5),
                "Regular multiplication should work");
    }

    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    public void testMultiplyWithZero() {
        assertEquals(0, calculator.efe(0,5), "Multiple with zero should be zero");
        assertEquals(0, calculator.efe(5,0), "Multiple with zero should be zero");
    }
}
