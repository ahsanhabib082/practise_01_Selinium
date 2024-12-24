package com.practise.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class TestNG_Examples {
    @AfterSuite
    public void afterSuiteExamples(){
        System.out.println("afterSuiteExamples");
    }
@Test(priority =2 )
    public void testExample(){
        System.out.println("testExample");
    }

    @Test(priority = 0)
    public void testExample2(){
        System.out.println("testExample2");
    }
@BeforeSuite
    public void beforeSuiteExamples(){
        System.out.println("beforeSuiteExamples");
    }


}
