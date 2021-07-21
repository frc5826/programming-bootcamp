package com.avisautomata.lectures;

// - Lecture #2

//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
public class Variables {

    public static void main(String[] args){
        reuse();
    }

    public static void simple(){
        //Format: [type] [name] = [value];
        int alpha = 1;
        System.out.println(alpha);
    }


    public static void reuse(){
        int alpha = 1;
        System.out.println(alpha);

        //Thought - we don't have "int" include here. Why's that?
        alpha = 2;
        System.out.println(alpha);
    }

    public static void multivariable(){
        int alpha = 1;
        int beta = 2;

        //Just like you can reassign with literal values (1, 2, etc), you can also assign other variables
        alpha = beta;

        System.out.println(alpha);
        System.out.println(beta);
    }

}
