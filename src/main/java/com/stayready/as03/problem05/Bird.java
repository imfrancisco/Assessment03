package com.stayready.as03.problem05;

public abstract class Bird implements Animal{
    private String move;
    private Integer speed;
    private String color;
    private String migrationMonth;

    public Bird(){
        this.move = "N/A";
        this.speed = 0;
        this.color = "N/A";
        this.migrationMonth = "N/A";
    }

    public Bird(String move, Integer speed, String color, String migrationMonth){
        this.move = move;
        this.speed = speed;
        this.color = color;
        this.migrationMonth = migrationMonth;
    }

    public String getMove(){
        return move;
    }

    public String getColor(){
        return color;
    }


    public void setMove(String move){
        this.move = move;
    }

    public void setSpeed(Integer speed){
        this.speed = speed;
    }

    public void setColor(String move){
        this.color = color;
    }


    @Override
    public String move(){
        return "fly";
    }

    @Override
    public int getSpeed() {
        return speed;
    }


    @Override
    public String color() {
        return color;
    }

    public void setMigrationMonth(String expected) {
        this.migrationMonth = expected;
    }

    public String getMigrationMonth() {
        return migrationMonth;
    }
}
