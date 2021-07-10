package com.avisautomata.lectures;

//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
public class Operators {

    public static void main(String[] args){
        equality();
    }

    //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
    public static void assignment(){
        //We've been doing this already, but for completeness '=' is an operator that assigns values.
        int var = 1;
    }


    public static void arithmetic(){
        //Arithmetic operators (+, -, *)
        System.out.println(1 + 2);
        System.out.println(1.2 * 2.3);
    }

    public static void division(){
        //Arithmetic operators (/, %)
        //Integer division is weird...
        System.out.println(1 / 2);
        System.out.println(1 % 2);
    }

    public static void variable(){
        //All of the previous operations work on variables as well
        double speed = 2.0;
        double time = 4.0;
        double distance = speed * time;
        System.out.println(distance);
    }

    public static void unaryIncrDecr(){
        //++ and -- allow us to add and remove 1 from a variable
        //This helps us keep our code cleaner
        int value = 1;
        System.out.println(value);
        value = value - 1;
        System.out.println(value);
        value--;
        System.out.println(value);
        value++;
        System.out.println(value);
    }

    //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html
    public static void equality(){
        // == returns true if two values are equal, != return true if they are not equal
        System.out.println(1 == 2);
        System.out.println(1 != 2);
    }

    public static void equalityCompare(){
        // > returns true if the value on the left is greater than the one on the right
        // >= will also return true if the two values are equal
        // < and <= are the same, just reversed. They will return true if the value on the left is less than.
        System.out.println(5 > 4);
        System.out.println(5 > 5);
        System.out.println(5 >= 5);
    }

    public static void unaryBool(){
        // ! (Logical complement) inverts boolean values
        boolean truth = false;
        System.out.println(truth);
        truth = !truth;
        System.out.println(truth);
        truth = !truth;
        System.out.println(truth);
    }

    public static void andOr(){
        // && (and) returns true if both booleans are true, false if not
        // || (or) return true if one boolean is true, false if both are false

        boolean hasCargoCapacity = true;
        boolean isOnCargoDuty = true;

        boolean shouldGetCargo = hasCargoCapacity && isOnCargoDuty;
        System.out.println(shouldGetCargo);

        boolean isExploring = true;

        boolean shouldMove = isExploring || isOnCargoDuty;
        System.out.println(shouldMove);
    }

    //Thought - what happens when you use operators on different types?
    //Thought - if you do multiple operations, does it matter which order you do them in?

}
