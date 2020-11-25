package by.tc.task01.task5;

import org.junit.Assert;
import org.junit.Test;

public class TestTask5 {
    @Test
    public void checkPerfectTest(){
        boolean actual = Task5.checkPerfect(6);
        Assert.assertTrue(actual);

        actual = Task5.checkPerfect(19);
        Assert.assertTrue(actual);
    }
}
