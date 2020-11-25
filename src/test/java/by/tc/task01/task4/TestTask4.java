package by.tc.task01.task4;

import org.junit.Assert;
import org.junit.Test;

public class TestTask4 {
    @Test
    public void checkNumbersTest(){
        boolean actual = Task4.checkNumbers(4, 9, 10, 16);
        Assert.assertTrue(actual);

        actual = Task4.checkNumbers(3, 7, 14, 1);
        Assert.assertFalse(actual);

        actual = Task4.checkNumbers(6, 24, 9, 13);
        Assert.assertFalse(actual);
    }
}
