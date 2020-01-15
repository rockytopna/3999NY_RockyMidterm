package string.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestingStringProblem {
    // public static void main(String[] args) {
    //Apply Unit Test into all the methods in this package.

    @Test
    public void testWordAreAnagram() {
        boolean expectedResult = true;
        boolean actualResult = Anagram.areAnagram("CAT", "ACT");
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testWordAreNotAnagram() { //N
        boolean expectedResult = true;
        boolean actualResult = Anagram.areAnagram("cat", "bat");
        Assert.assertEquals(expectedResult, actualResult);
    }

}

