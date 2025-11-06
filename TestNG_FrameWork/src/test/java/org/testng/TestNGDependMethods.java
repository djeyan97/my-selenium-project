package org.testng;

import org.testng.annotations.Test;

public class TestNGDependMethods {

    // Methods depending on another method to function in order
    @Test (priority=1,enabled=true)
    public void higherSecondary(){
        System.out.println("Higher Secondary Completed");
    }

    @Test(priority=2, dependsOnMethods = "higherSecondary")
    public void ugCourse (){
        System.out.println("Under Graduation Completed");
    }

    @Test (priority = 3, dependsOnMethods = "ugCourse")
    public void pgCourse (){
        System.out.println("Post Graduation Completed");
    }


}
