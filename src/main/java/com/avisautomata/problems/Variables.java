package com.avisautomata.problems;

import com.avisautomata.problems.tests.TestHook;

//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
public class Variables {

    public void simple(){
        //Format: [type] [name] = [value];

        //Test! - Assign 'alpha' a value between 50 and 100
        int alpha = 0;

        //Do not change this line
        hook.assertTrueHook(50 <= alpha && alpha <= 100);
    }

    public void reuse(){
        int alpha = 1;

        //Do not change this line
        int o = alpha;

        //Test! - Change 'alpha' to a new value (not 1).

        //Do not change this line
        hook.assertNotEqualsHook(alpha, o);
    }

    public void multivariable(){
        int alpha = 1;
        int beta = 2;

        //Test! - Make beta equal alpha without changing the lines above

        //Do not change this line
        hook.assertEqualsHook(alpha, beta);
    }

    //Start testing helper code - you can ignore this
    private final TestHook hook;

    public Variables(TestHook hook){
        this.hook = hook;
    }
    //End testing helper code

}
