package com.thegeeksdiary;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
    @Test
    public void Signup(){
        System.out.println("************************");
        System.out.println("Executing Signup First");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = {"Signup"})
    public void SignIn(){
        System.out.println("************************");
        System.out.println("Executing SignIn Second because It depends on Signup");
    }

    @Test(dependsOnMethods = {"SignIn"})
    public void SignOut(){
        System.out.println("************************");
        System.out.println("Executing SignOut Third because It depends on SignIn");
    }
}
