package by.tc.task01.task2;

public class Task2 {
    public static int getDays(int year, int month){
        if(month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        }

        if(month == 2){
            if(checkYear(year)){
                return 29;
            }else{
                return 28;
            }
        }else{
            return 31;
        }
    }

    public static boolean checkYear(int year){
        if(year % 4 == 0){
            return true;
        }else{
            return false;
        }
    }
}
