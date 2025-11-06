package org.testng;

import org.testng.annotations.Test;

public class TestNGPractice {

    // (priority = ) used to arrange the output as per order
    @Test (priority=1)
    public void startTheCar(){
        System.out.println("Start the Car");
    }

    //To skip the testcase using enabled=false
    @Test (priority=6,enabled=false)
    public void startTheMusic(){
        System.out.println("Start the Music");
    }

    @Test (priority=2)
    public void switchToFirstGear(){
        System.out.println("Switch To First Gear");
    }

    @Test (priority=3)
    public void switchToSecondGear(){
        System.out.println("Switch To Second Gear");
    }

    @Test  (priority=4)
    public void switchToThirdGear(){
        System.out.println("Switch To Third Gear");
    }

    @Test  (priority=5)
    public void switchToFourthGear(){
        System.out.println("Switch To Fourth Gear");
    }
}
