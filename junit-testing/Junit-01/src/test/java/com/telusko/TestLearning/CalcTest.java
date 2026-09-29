package com.telusko.TestLearning;

import junit.framework.TestCase;

public class CalcTest extends TestCase {

    public void testTestDivide1() {

        // 1. it is example for this code is running or not
             //System.out.println(" first test ran on junit5 ");


        // actual junit testing code for calc class method ........
            // step 1 -> create a instance of non -static class Calc to test its methods
            Calc c = new Calc() ;

            // step 2 -> start testing the called method ...using assertequals() .....
            int actualresult = c.divide( 8 , 2 ) ;
            int expectedresult = 4 ;

            assertEquals( expectedresult , actualresult );

    }

}