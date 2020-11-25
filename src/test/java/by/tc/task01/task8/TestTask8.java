package by.tc.task01.task8;

import org.junit.Assert;
import org.junit.Test;

public class TestTask8 {
    @Test
    public void getFunctionResultTest(){
        double actual = Task8.getFunctionResult(4);
        double expected = 5;

        Assert.assertEquals(expected, actual, 0.0);

        actual = Task8.getFunctionResult(2);
        expected = 0.5;

        Assert.assertEquals(expected, actual, 0.0);
    }
}
