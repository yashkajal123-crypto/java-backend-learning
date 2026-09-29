package com.telusko.service;

import org.junit.jupiter.api.Test;
import com.telusko.course.javaCourse ;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestAssertTrue {

    // example 1 => asserttrue ()

        // create an object of class whose method needs to be tested
        PurchaseCourse pc = new PurchaseCourse() ;
        // created a test method
        @Test
        void proceedWithCourse() {

            // here a new object of javaCourse class is created and passed
            // in function as parameter which is tested here !!
            boolean status = pc.proceedWithCourse(new javaCourse()); // gives status == true here !!
            assertTrue(status);
//            assertFalse( status , " its failed because unit is result in true ");
        }

 
   // example 2 => assertfalse() ->

        //   assertFalse(true);  // this test got failed
        //   assertFalse(false); // this test got passed
        // note to run assertion methods must define test method first using @test annotation then run inside it
        @Test
        void test()
            {
            String name = "Junit5" ;
            // message prints only when test got failed , hence here when condition is true !!!
            assertFalse( name.length() < 5 , " as length is 6 ( true ) ->  so test is failing" );  // this test always fails !!


        }

    }

