package com.stayready.as03.problem05;

import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void testMove() {
        Animal horse = (Animal)(Object)new Horse();
        String expected = "gallop";

        String actual = horse.move();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testColor() {
        Animal horse = (Animal)(Horse)new Horse();
        String expected = "brown";


        String actual = horse.color();

        Assert.assertEquals(expected, actual);
    }

    // I created this test
    @Test
    public void getSpeedTest(){
        // Given
        Animal horse = (Animal)(Horse) new Horse();
        int expected = 40;


        // When
        int actual = horse.getSpeed();

        // Then
        Assert.assertEquals(expected,actual);
    }
}