package by.tc.task01.task1;

public class Task1 {
    public static int getSquareNumber(int number){
        int digit = number % 10;

        return (int)Math.pow(digit, 2) % 10;
    }
}
