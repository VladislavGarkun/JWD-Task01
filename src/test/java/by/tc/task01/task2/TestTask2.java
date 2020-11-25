package by.tc.task01.task2;

import org.junit.Assert;
import org.junit.Test;

public class TestTask2 {
    @Test
    public void getDaysTest(){
        int actual = Task2.getDays(2001, 5);
        int expected = 31;

        Assert.assertEquals(expected, actual);

        actual = Task2.getDays(2016, 2);
        expected = 29;

        Assert.assertEquals(expected, actual);

        actual = Task2.getDays(2019, 2);
        expected = 28;

        Assert.assertEquals(expected, actual);

        actual = Task2.getDays(2003, 10);
        expected = 30;

        Assert.assertEquals(expected, actual);
    }
}
