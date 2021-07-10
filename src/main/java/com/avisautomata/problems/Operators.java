package com.avisautomata.problems;

//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html
public class Operators {

    //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html
    public double multioperation(double a, double b, double c){
        //Test! - Replace '0' below with the value of b minus c then divided by a
        return 0;
    }

    public double calculateDistance(double speed, double time){
        //Test! If a robot is going a given speed for a given time, replace 0 with the distance the robot has traveled
        return 0;
    }

    public double remainingTrip(double speed, double time){
        //Test! Building on "calculateDistance", if our total trip is 100m how much farther do we have to go?
        return 0;
    }

    public int howManyTrips(int numOfCrates){
        //Test! Say our robot can ONLY hold 6 crates (no more, no less), how many "full" trips do we need to make?
        return 0;
    }

    public int howManyLeft(int numOfCrates){
        //Test! In our "howManyTrips" examples, how many crates are left over?
        return 0;
    }

    public boolean shouldExplore(boolean isOnExploreDuty, double batteryCapacity){
        //Test! Your robot should explore is it's on duty and has a battery capacity over 30% (.30)
        return false;
    }

    public boolean shouldReturnHome(int cargo, double batteryCapacity){
        //Test! Your robot should return home if its cargo is full (max 10) or its batter is below 30% (.30)
        return false;
    }

}
