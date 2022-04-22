package lesson1.test1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        int expectedLocalNumber = 14;
        assertEquals("Method has returned incorrect value", expectedLocalNumber, MainClass.getLocalNumber());
    }
}
