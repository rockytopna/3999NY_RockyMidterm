package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    //public static void main(String[] args) {
    /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     *
     */

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String args[]) {
        int i, fact = 1;
        int number = 5;//It is the number to calculate factorial
        fact = factorial(number);
        System.out.println("Using Recursion");
        System.out.println("Factorial of " + number + " is: " + fact);

        //Iteration;

        int j;
        int flag = 1;
        int value = 5;

        for (j = 1; j <= value; j++) {
            flag = flag * j;


        }
        System.out.println("Using Iteration");
        System.out.println("Factorial of " + number + " is: " + fact);


    }

}





