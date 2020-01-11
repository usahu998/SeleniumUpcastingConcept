package com.selenium;


import org.testng.annotations.Test;

public class TestNG {
    @Test
    public void testName() {
        System.out.println("Before");
    }
    @Test
    public void TestData(){
        System.out.println("TestData");
    }
    @Test
    public void After(){
        System.out.println("After Data");
    }
}
