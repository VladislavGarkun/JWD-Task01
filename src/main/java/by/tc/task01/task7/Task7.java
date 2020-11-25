package by.tc.task01.task7;

public class Task7 {
    public static int checkCloser(int x1, int y1, int x2, int y2){
        if(getDistance(x1, y1) == getDistance(x2, y2)){
            return 1;
        }

        if(getDistance(x1, y1) > getDistance(x2, y2)){
            return 2;
        }else{
            return 3;
        }
    }

    private static double getDistance(int x, int y){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
