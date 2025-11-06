package org.testng;

import org.testng.annotations.Test;

public class TestNGGroup{

    @Test(groups = "Apple")
    public void iphone17ProMax(){
        System.out.println("Testing iphone17 Pro Max");
    }

    @Test(groups = "Apple")
    public void iphone16ProMax(){
        System.out.println("Testing iphone16 Pro Max");
    }

    @Test(groups = "Samsung")
    public void s23Ultra(){
        System.out.println("Testing S23 Ultra");
    }

    @Test(groups = "Samsung")
    public void s24Ultra(){
        System.out.println("Testing S24 Ultra");
    }

    @Test(groups = "Moto")
    public void motoEdge60(){
        System.out.println("Testing Moto Edge 60");
    }

    @Test(groups = "Moto")
    public void motoG35(){
        System.out.println("Testing Moto G35");
    }

}
