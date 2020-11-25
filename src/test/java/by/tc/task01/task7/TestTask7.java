package by.tc.task01.task7;

import org.junit.Assert;
import org.junit.Test;

public class TestTask7 {
    @Test
    public void checkCloserTest(){
        int actual = Task7.checkCloser(7, 2, 9, 7);
        int expected = 3;

        Assert.assertEquals(expected, actual);

        actual = Task7.checkCloser(3, 5, 2, 7);
        expected = 1;

        Assert.assertEquals(expected, actual);
    }
}
