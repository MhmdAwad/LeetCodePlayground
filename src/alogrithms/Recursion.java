package alogrithms;

public class Recursion {
    // 0 1 1 2 3 5 8 13 21 34 55
    public static int fibonacciExercise(int number){
        if(number <2){
            return number;
        }
        return
                fibonacciExercise(number-1)
                        +
                        fibonacciExercise(number -2 );
    }


    public static int factorialRecursive(int number){
        if(number == 1){
            return 1;
        }
        return number * factorialRecursive(number-1);
    }
}
