package by.tc.task01.task5;

public class Task5 {
    public static boolean checkPerfect(int number){
        int sum = 0;

        for(int i = 1; i < number; ++i){
            if(number % i == 0){
                sum += i;
            }
        }

        if(sum == number){
            return true;
        }else{
            return false;
        }
    }
}
