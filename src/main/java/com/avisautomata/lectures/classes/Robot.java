package com.avisautomata.lectures.classes;

public class Robot {

    private double location;
    private double speed;

    public Robot() {
        this.location = 0;
        this.speed = 0;
    }


    public double getLocation() {
        return location;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void move(double seconds){
        this.location += (this.speed * seconds);
    }

    public static void main(String[] args){
        Robot bot = new Robot();
        bot.setSpeed(2);
        bot.move(5);
        System.out.println(bot.getLocation());
    }
}
