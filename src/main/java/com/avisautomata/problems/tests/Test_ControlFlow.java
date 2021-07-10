package com.avisautomata.problems.tests;

import com.avisautomata.problems.ControlFlow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Test_ControlFlow {

    @Test
    public void testDistanceToGoal(){
        distanceHelper(new ControlFlow(), 50);
        distanceHelper(new ControlFlow(), -50);

        if(new ControlFlow().distanceToGoal(0) != 0.0){
            fail("Our robot was at the goal (0) but drove away!");
        }
    }

    @Test
    public void testPickupCargo(){
        ControlFlow cf = new ControlFlow();
        assertEquals(10, cf.pickupCargo(20), "Max 10, 20 available");
        assertEquals(5, cf.pickupCargo(5), "Max 10, 5 available");
        assertEquals(0, cf.pickupCargo(0), "Max 10, 0 available");
    }

    public static void distanceHelper(ControlFlow cf, double startDistance){
        double distance = Math.abs(startDistance);
        int count = 0;
        while(count < 1000 && Math.abs(distance) > .5){
            count++;
            double speed = cf.distanceToGoal(distance);
            if(speed > 1.0 || speed < -1.0){
                fail("Your robot is going too fast: " + speed);
            }
            double tmpDist = Math.abs(distance - speed);
            if(tmpDist > distance){
                fail("Your robot is headed the wrong way!");
            }
            else {
                distance = tmpDist;
            }
        }

        if(count >= 1000){
            fail("Your robot didn't make it to the destination: " + distance);
        }
    }

}
