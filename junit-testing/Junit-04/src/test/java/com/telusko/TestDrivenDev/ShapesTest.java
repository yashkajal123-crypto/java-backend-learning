package com.telusko.TestDrivenDev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {

    // instance is created above the test methods so that used in all when created once !!
    Shapes shape = new Shapes() ;

    @Test
    void squareShapeArea() {

        assertEquals( 100 , shape.SquareShapeArea( 10 ) );
    }

    // note that -> message is only printed when test case fails !!
    @Test
    void circleShapeArea() {

        assertEquals( 78.5 , shape.CircleShapeArea( 5  ) , " i am taking the radius value wrong ");
    }


    // better way to send message using functional interface SUPPLIER .......******
    @Test
    void circleShapeArea_Supplier() {

        assertEquals( 78.5 , shape.CircleShapeArea( 5  ) , () -> " i am taking the radius value wrong ");
    }

    // example of asserttrue testcase ................
    @Test
    void testAssertTrue() {

        String name = "yash" ;

        assertTrue( name.equals("yash")) ;   // test passed here !!

    }

}