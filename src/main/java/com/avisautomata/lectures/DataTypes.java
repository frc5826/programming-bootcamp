package com.avisautomata.lectures;

// - Lecture #3

//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
public class DataTypes {

    public static void main(String[] args){
        System.out.println(Float.MAX_VALUE);
    }

    public void whole_numbers() {
        //"short" is used to store small whole numbers
        short small = 32767;
        small = -32768;

        //"int" is used to store medium whole numbers
        int medium = 2147483647;
        medium = -2147483648;

        //"long" is used to store big whole numbers
        long big = 9223372036854775807L;
        big = -9223372036854775808L;
    }

    public void decimals(){
        //"float" is used to store 32-bit decimal values - Max: 3.4028235E38
        float medium = 3.4028235f;

        //"double" is used to store 64-bit decimal values - Max: 1.7976931348623157E308
        double large = 1.797693134862315700000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000;
    }

    public void booleans(){
        //"boolean" is used to store either 'true' or 'false'
        boolean truth = true;
        truth = false;
    }

    public void characters(){
        //"char" is used to store characters
        char a = 'a';
        char zero = '0';
        char symbol = '+';
    }

    public void strings(){
        //"String" is used to store many characters
        String message = "I'm a robot!";
    }

}
