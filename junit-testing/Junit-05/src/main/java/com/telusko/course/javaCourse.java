package com.telusko.course;

import com.telusko.dao.Course;

public class javaCourse implements Course {

    // here we are saying that java course has been purchased => true
    @Override
    public boolean coursePurchased() {
        System.out.println( "java course purchased");
        return true ;
    }
}
