package by.tc.task01.task1;

import org.junit.Assert;
import org.junit.Test;

public class TestTask1 {
    @Test
    public void getSquareNumberTest(){
        int actual = Task1.getSquareNumber(49);
        int expected = 1;

        Assert.assertEquals(expected, actual);

        actual = Task1.getSquareNumber(63);
        expected = 8;

        Assert.assertEquals(expected, actual);
    }
}
