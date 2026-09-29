package com.telusko.service;

import com.telusko.dao.Course;

public class PurchaseCourse {

    private Course course ;


    // in test class -> we do test this method as a unit !!!!!
    public boolean proceedWithCourse( Course course ) { // Course course = new javaCourse is passed as parameter here

        return course.coursePurchased();

    }
}
