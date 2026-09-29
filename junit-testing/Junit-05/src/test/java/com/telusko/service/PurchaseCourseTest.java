package com.telusko.service;

import com.telusko.course.JunitCourse;
import com.telusko.course.SpringBootCourse;
import com.telusko.course.javaCourse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PurchaseCourseTest {

    @Test
    void testJavaCoursePurchase() {

        PurchaseCourse purchaseCourse = new PurchaseCourse();

        boolean result =
                purchaseCourse.proceedWithCourse( new javaCourse() );

        assertTrue(result);
    }

    @Test
    void testJunitCoursePurchase() {

        PurchaseCourse purchaseCourse = new PurchaseCourse();

        JunitCourse junitCourse = new JunitCourse();

        boolean result =
                purchaseCourse.proceedWithCourse(junitCourse);

        assertTrue(result);
    }

    @Test
    void testSpringBootCoursePurchase() {

        PurchaseCourse purchaseCourse = new PurchaseCourse();

        SpringBootCourse springBootCourse =
                new SpringBootCourse();

        boolean result =
                purchaseCourse.proceedWithCourse(springBootCourse);

        assertTrue(result);
    }
}