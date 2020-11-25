package by.tc.task01.task9;

import org.junit.Assert;
import org.junit.Test;

public class TestTask9 {
    @Test
    public void getSquareTest(){
        double actual = Task9.getSquare(9);
        double expected = 254.34;

        Assert.assertEquals(expected, actual, 0.0);

        actual = Task9.getSquare(-5);
        expected = -1;

        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void getLengthTest(){
        double actual = Task9.getLength(9);
        double expected = 56.52;

        Assert.assertEquals(expected, actual, 0.0);

        actual = Task9.getLength(-5);
        expected = -1;

        Assert.assertEquals(expected, actual, 0.0);
    }
}
