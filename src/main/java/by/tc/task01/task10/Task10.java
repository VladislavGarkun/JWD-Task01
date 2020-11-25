package by.tc.task01.task10;

import java.util.HashMap;

public class Task10 {
    public static HashMap<Integer, Double> getFunctionResults(int a, int b, int h){
        HashMap<Integer,Double> result = new HashMap<Integer, Double>();

        for(int x = a; x <= b; x += h){
            result.put(x, Math.tan(x));
        }

        return result;
    }
}
