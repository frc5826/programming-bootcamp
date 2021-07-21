package com.avisautomata.lectures;

// - Lecture #5

//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html
public class ControlFlow {

    public static void main(String[] args){
        forstatement();
    }

    public static void ifstatement(){
        boolean maxCapacity = false;
        if(maxCapacity) {
            //Run some code only if we're at max capacity
            System.out.println("I'm full!");
        }
        //Thought - What would we change if we wanted to do something when we weren't at max capacity?
    }

    public static void ifelse(){
        int maxCapacity = 10;
        int currentCargo = 5;

        if(currentCargo >= maxCapacity) {
            System.out.println("I'm full!");
        }
        else {
            System.out.println("I have room ");
        }
    }

    public static void elseif(){
        int maxCapacity = 10;
        int currentCargo = 5;

        if(currentCargo > maxCapacity) {
            System.out.println("Help, I'm stuck!");
        }
        else if(currentCargo < maxCapacity){
            System.out.println("I have room ");
        }
        else {
            //Thought - what case would this run? What should we do?
        }
    }

    public static void whilestatement(){
        int maxCapacity = 10;
        int currentCargo = 5;

        System.out.println("Starting cargo: " + currentCargo);

        while(currentCargo < maxCapacity){
            //Pick up some cargo
            currentCargo++;
            System.out.println("Picking up cargo: " + currentCargo);
        }

        //Go drop off your cargo
        System.out.println("Final cargo: " + currentCargo);
    }

    public static void forstatement(){
        /*
        for(initialization; termination; increment) {
            dosomething();
        }
         */

        //Old way
        int j = 0; //Initialization
        while(j < 10) { //Termination
            System.out.println("While Loop " + j);
            j++; //Increment
        }

        //Much cleaner
        for(int i = 0; i < 10; i++){
            System.out.println("For Loop " + i);
        }

    }
}
