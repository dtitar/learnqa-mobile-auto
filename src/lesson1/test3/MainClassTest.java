package lesson1.test3;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class MainClassTest {

    @Test
    public void testGetClassString() {
        String expectedSubString1 = "Hello";
        String expectedSubString2 = "hello";
        String actualString = MainClass.getClassString();
        assertTrue(String.format("Actual string \"%s\" doesn't contain %s or %s", actualString, expectedSubString1, expectedSubString2),
                actualString.contains(expectedSubString1) || actualString.contains(expectedSubString2));
    }
}
