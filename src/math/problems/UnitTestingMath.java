package math.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestingMath {

    //Apply Unit testing into each classes and methods in this package.

    @Test

    public void testPositiveFactorial() {
        int expectedResult = 1;
        int actualResult = Factorial.factorial(1);
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test

    public void testNegativeFactorial() {
        int expectedResult = 1;
        int actualResult = Factorial.factorial(5);
        Assert.assertEquals(expectedResult, actualResult);


    }



}


