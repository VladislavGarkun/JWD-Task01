package by.tc.task01.task10;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestTask10 {
    @Test
    public void getFunctionResultsTest(){
        HashMap<Integer, Double> actual = Task10.getFunctionResults(3, 18, 6);
        HashMap<Integer, Double> expected = new HashMap<Integer, Double>();

        expected.put(3, -0.1425465430742778);
        expected.put(9, -0.45231565944180985);
        expected.put(15, -0.8559934009085187);

        Assert.assertEquals(expected, actual);
    }
}
