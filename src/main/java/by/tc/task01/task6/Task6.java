package by.tc.task01.task6;

public class Task6 {
    public static String getTime(int seconds){
        if(seconds < 0 || seconds >= 86400){
            System.out.println("Invalid input!");

            return "";
        }

        int h = seconds / 3600;
        int m = (seconds - h * 3600) / 60;
        int s = seconds - (h * 3600 + m * 60);

        return h + ":" + m + ":" + s;
    }
}
