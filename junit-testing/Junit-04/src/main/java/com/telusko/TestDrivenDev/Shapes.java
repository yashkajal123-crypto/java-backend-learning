package com.telusko.TestDrivenDev;

// sample project to demonstrate the TTD technique while created some shapes and then test their area !!
// we create this project using the following
// 1. maven as build tool
// 2. junit5 testing framework
// 3. jdk 21 that supports java as primary source code language here in this project


public class Shapes {

    public double   SquareShapeArea( double  length ){

         //  int res = length * length ;
         // return res ;

        return length * length ;
    }

    public double CircleShapeArea( double  radius ) {

        return  3.14 * radius * radius ;

    }
}
