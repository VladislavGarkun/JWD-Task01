package by.tc.task01.task6;

import org.junit.Assert;
import org.junit.Test;

public class TestTask6 {
    @Test
    public void getTimeTest(){
        String actual = Task6.getTime(7432);
        String expected = "2:3:52";

        Assert.assertEquals(expected, actual);

        actual = Task6.getTime(99999);
        expected = "";

        Assert.assertEquals(expected, actual);
    }
}
