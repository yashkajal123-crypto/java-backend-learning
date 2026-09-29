package com.telusko;

import java.util.Arrays;

public class SortingArrays {

    public int[] SortingArray(int [] input ) {

        // code for TestException class...........
//            Arrays.sort( input ) ;
//            return input ;

        // code for Testing performance class..........
            for( int i = 0 ; i < 1000000 ; i ++ ) {
                Arrays.sort( input );         // input == unsorted  , here !!
            }
            return input ;

    }
}
