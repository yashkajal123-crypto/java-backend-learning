package com.telusko.TestDrivenDev;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

// demonstration  of all annotations  seen below =>

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
// using this we make BeforeAll and AfterAll methods be non-static too !!    ( important ) !! 
class ShapesNewTest {

    ShapesNew shape ;

    // constructor default
    // called each time instance created here -> so  two tests and for them -> two times BeforeEach Vala method called ....
    ShapesNewTest() {
        System.out.print("\ntest object is created before test method......");
    }

// note -> these all annotations only applied to methods , and , not constructors !!
// note -> static keyword is used in methods with annotations BeforeAll and After aLl
           // because , it makes them execute only once -> irrespective of / independent of object created !!
    @BeforeAll
    static void  beforeAll() {

        System.out.println("before all test ,  it runs !! ");
    }

    @AfterAll
    static void  AfterAll() {

        System.out.println("after  all test  runs !! ");
    }


    @BeforeEach
    void init() {

        // in this method we create an instance of class for whose methods are under tests in this class
        // in this way -> BeforeEach -> duplication is removed from test code !!
        shape =  new ShapesNew() ;
        System.out.println("before test runs ");

    }


    @Test
    void squareShapeArea() {
//        ShapesNew shape = new ShapesNew() ;

        assertEquals( 100 , shape.SquareShapeArea( 10 ));

        System.out.println("test actual runs");

    }

    @Test
    void circleShapeArea() {

//        ShapesNew  shape = new ShapesNew() ;

        assertEquals( 153.86 , shape.CircleShapeArea( 7 ));

        System.out.println("test actual runs");

    }

    @AfterEach
    void End() {

        System.out.println("after test runs ");

    }


    // notes ->
    // junit 4  vs junit5 ->
        // before  vs BeforeEach
        // after  vs  AfterEach
        // BeforeClass vs BeforeAll
        // AfterClass vs AfterAll


}