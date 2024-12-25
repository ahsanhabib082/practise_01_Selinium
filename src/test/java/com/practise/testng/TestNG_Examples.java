package com.practise.testng;

import org.testng.annotations.*;


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
@BeforeTest
    public void beforeTestExamples(){
        System.out.println("beforeTestExamples");
    }


    @AfterTest
    public void afterTestExamples(){
        System.out.println("afterTestExamples");
    }
@BeforeSuite
    public void beforeSuiteExamples(){
        System.out.println("beforeSuiteExamples");
    }


    @BeforeClass
    public void BeforeClassExamples(){
        System.out.println("BeforeClassExamples");
    }
    @AfterClass
    public void AfterClassExamples(){
        System.out.println("AfterClassExamples");
    }
    @BeforeMethod
    public void BeforeMethodExamples(){
        System.out.println("BeforeMethodExamples");
    }
    @AfterMethod
    public void AfterMethodExamples(){
        System.out.println("AfterMethodExamples");
    }


}
