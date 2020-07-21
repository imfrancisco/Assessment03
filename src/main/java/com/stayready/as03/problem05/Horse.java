package com.stayready.as03.problem05;

public class Horse implements Animal{

    private String move;
    private Integer speed;
    private String color;

    public Horse(){
        this.move = "gallop";
        this.speed = 40;
        this.color = "brown";
    }

    public Horse(String move, Integer speed, String color){
        this.move = move;
        this.speed = speed;
        this.color = color;
    }


    public String getMove(){ return move;}
    public String getColor(){
        return color;
    }

    public void setMove(String move){this.move = move;}
    public void setSpeed(Integer speed){
        this.speed = speed;
    }
    public void setColor(String color){
        this.color = color;
    }


    public String move(){
        return move;
    }

    @Override
    public int getSpeed() {
        return speed;
    }


    @Override
    public String color() {
        return color;
    }
}
