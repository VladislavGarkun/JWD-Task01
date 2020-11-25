package by.tc.task01.task3;

import org.junit.Assert;
import org.junit.Test;

public class TestTask3 {
        @Test
        public void getSquareTest(){
            double actual = Task3.getSquare(83);
            double expected = 41.5;

            Assert.assertEquals(expected, actual, 0.0);

            actual = Task3.getSquare(20);
            expected = 13;

            Assert.assertEquals(expected, actual, 0.0);
    }
}
