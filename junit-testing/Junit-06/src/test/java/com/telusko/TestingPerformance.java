package com.telusko;
import org.junit.jupiter.api.Test;

import java.time.Duration; // Duration is functional interface of time class ..........

import static org.junit.jupiter.api.Assertions.*;


public class TestingPerformance {

    // use case of assertTimeout() method inside test method to test performance of java code !!
    @Test
    void TestingSortingMethod_Performance() {

        // instance must be created of class whose method is under test here
        SortingArrays array = new SortingArrays() ;

        // pass ( unsorted == input )  i.e as parameter in object=> array's method () ...........
        int[] unsorted = { 13 , 31 , 54 } ;

        // required use case !!
        // it is available only in jnuit5 ******
        assertTimeout( Duration.ofMillis(10000 ) , () -> array.SortingArray( unsorted )) ;
    }
}
