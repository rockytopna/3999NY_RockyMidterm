package math.problems;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */

        int counter = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < 1000000; i++) {
            if (isPrime(i)) {
                list.add(i);
                System.out.println(i);
                counter++;

            }
        }
        System.out.println("total number of prime numbers" + counter);
    }
    //}
    public static boolean isPrime ( int number){
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= number; i = i + 2) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }
}


