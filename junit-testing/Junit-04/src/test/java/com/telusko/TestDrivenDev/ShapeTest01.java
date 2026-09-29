package com.telusko.TestDrivenDev;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest01 {

    Shapes s = new Shapes() ;

    @Test
    void squareShapeArea() {

        // assertNotEquals( 1600 , s.SquareShapeArea( 40 ));  // this test fails as ,equals() is true

        assertNotEquals( 1700 , s.SquareShapeArea( 40 ));   // this test passed here , as .equals() is false

    }

    // default passing of string as message in test methods
    @Test
    void circleShapeArea() {

        assertNotEquals( 300 , s.CircleShapeArea(7) , " area is equal to expected area so failed !! ");
    }

    // using functional interface => =>  Supplier<string> to print the message
    @Test
    void circleShapeArea_Supplier(){

        assertNotEquals( 400 , s.CircleShapeArea(7) , () -> " area is not equal to expected area so failed here !! ");
    }
}
