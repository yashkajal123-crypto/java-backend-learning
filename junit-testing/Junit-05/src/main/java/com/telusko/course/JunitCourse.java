package com.telusko.course;

import com.telusko.dao.Course;

public class JunitCourse implements Course {

    @Override
    public boolean coursePurchased() {
        return true ;
    }
}
