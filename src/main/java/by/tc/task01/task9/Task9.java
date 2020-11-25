package by.tc.task01.task9;

public class Task9 {
    public static double getSquare(int r){
        if(r <= 0)
        {
            System.out.println("Invalid input!");
            return -1;
        }

        return 3.14 * Math.pow(r, 2);
    }

    public static double getLength(int r){
        if(r <= 0)
        {
            System.out.println("Invalid input!");
            return -1;
        }

        return 2 * 3.14 * r;
    }
}
