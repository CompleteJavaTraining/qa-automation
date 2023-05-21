package com.thegeeksdiary;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */

class AppTest {
    int counterClassCount = 0;
    int counterMethodCount = 0;

    int counterTest = 0;

    @BeforeSuite
    public void beforeSuite(){
        System.out.println(String.format("This is printed once per suite"));
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println(String.format("This is printed after running the suite"));
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println(String.format("Starting Test..."));
        counterTest +=1;
    }

    @BeforeTest
    public void afterTest(){
        System.out.println(String.format("Starting finished test: test counter is %d", counterTest));
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println(String.format("Starting Test Class execution: The value of the counterClassCount should be just 1"));
        counterClassCount += 1;
    }

    @AfterClass
    public void afterClass(){
        System.out.println(String.format("Finished Test Class execution: The value of the counterClassCount is %d", counterClassCount));
    }

    @BeforeMethod
    public void beforeEachTestCase(){
        System.out.println(String.format("Starting Test Case execution: method counter value is %d", counterMethodCount));
        counterMethodCount += 1;
    }

    @AfterMethod
    public void afterEachTestCase(){
        System.out.println(String.format("Test Case executed: method counter value is %d", counterMethodCount));
    }

    @Test(groups = {"arithmatic", "maths"}, suiteName = "maths", testName = "addTest")
    public void addTest(){
        System.out.println(String.format( "Current Thread is %d", Thread.currentThread().getId()));
        int first = 2;
        int second = 3;
        assert first + second == 5;
    }

    @Test(groups = {"arithmatic", "maths"}, suiteName = "maths", testName = "addTest")
    public void addTestSecond(){
        int first = 2;
        int second = -3;
        assert first + second == -1;
    }

    @Test(groups = {"arithmatic", "maths"}, suiteName = "maths",testName = "substractTest")
    public void substractTest(){
        int first = 5;
        int second = 3;
        assert first - second == 2;
    }

    @Test(groups = {"arithmatic", "maths"}, suiteName = "maths", testName = "multiplyTest")
    public void multiplyTest(){
        int first = 5;
        int second = 3;
        assert first * second == 15;
    }

    @Test(groups = {"arithmatic", "maths"}, suiteName = "maths", testName = "divideTest")
    public void divideTest(){
        int first = 15;
        int second = 3;
        assert first/second == 5;
    }

    @Test(groups = {"geometry", "maths"}, suiteName = "area", testName = "areaOfCircle")
    public void calculateAreaOfCircle(){
        double radius = 10;
        double area = Math.PI * (Math.pow(radius, 2));

        assert area == (Math.PI * (Math.pow(radius, 2)));
    }
}
