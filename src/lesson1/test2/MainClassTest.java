package lesson1.test2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainClassTest {

    @Test
    public void testGetClassNumber() {
        MainClass main = new MainClass();
        int expectedMinValue = 45;
        int actualValue = main.getClassNumber();
        assertTrue(String.format("Actual value - %d less than expected (>%d)", actualValue, expectedMinValue), actualValue > expectedMinValue);
    }
}
