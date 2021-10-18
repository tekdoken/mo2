package bai9.testde;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        int x = 1;
        int y = 1;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
    }

    private void assertEquals(int expResult, int result) {
    }
    @Test
    public void testAdd2() {
        int x = Integer.MAX_VALUE;
        int y = 1;
        Calculator instance = new Calculator();
        try {
            int result = instance.add(x, y);
            assertFalse(true);
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    private void assertFalse(boolean b) {
    }

    private void assertTrue(boolean b) {
    }
}
