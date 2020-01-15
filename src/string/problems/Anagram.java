package string.problems;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        areAnagram("CAT", "ACT");
        areAnagram("ARMY", "MARY");
        System.out.println( "Check if they are Anagram" + " " + areAnagram("CAT", "ACT"));





    }

    public static boolean areAnagram(String word1, String word2) {

        if (word1.length()!= word2.length()){
            return false;

        }
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        for (int i = 0; i < word1Array.length; i++) {
            if (word1Array[i] != word2Array[i]) {
                return false;

            }
        }

        return true;
    }
}


