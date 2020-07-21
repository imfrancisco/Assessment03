package com.stayready.as03.problem05;

import org.junit.Assert;
import org.junit.Test;

public class BlueJayTest {

    @Test
    public void testMove() {
        Bird blueJay = (Bird)(Object)new BlueJay();
        String expected = "fly";

        String actual = blueJay.move();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testColor() {
        Animal blueJay = (Animal)(Object)new BlueJay();
        String expected = "blue";

        String actual = blueJay.color();

        Assert.assertEquals(expected, actual);
    }

    // I created this test
    @Test
    public void speedTest(){
        Bird aBlueJay = new BlueJay();
        int expected = 13;

        aBlueJay.setSpeed(13);
        int actual = aBlueJay.getSpeed();

        Assert.assertEquals(expected,actual);
    }
}
