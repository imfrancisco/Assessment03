package com.stayready.as03.problem05;

public class BlueJay extends Bird{

    public BlueJay(){
        super();
    }

    @Override
    public String move() {
        return super.move();
    }

    @Override
    public String color() {
        return "blue";
    }

    @Override
    public int getSpeed() {
        return 13;
    }

    @Override
    public void setMigrationMonth(String expected) {
        super.setMigrationMonth(expected);
    }

    @Override
    public String getMigrationMonth() {
        return super.getMigrationMonth();
    }
}
