package com.telusko.TestDrivenDev;

// we use junit4 here -> so method must be public else it throws error ...
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayTesting {

    @Test
    public void testArrays(){

        // we create arrays dynamically here !!
        int[] expected = { 2 , 4, 6, 8 } ;
        int[] actual = { 2 , 6, 4 ,  8, } ;

        Arrays.sort( actual );   // gives { 2 , 4, 6, 8 }

        // passes bcoz it compares actual array content using that assertions
         assertArrayEquals( expected , actual ) ;

        // fails bcoz it compares the reference of two arrays and not arrays itself
        //  assertEquals( expected , actual );
    }
}
