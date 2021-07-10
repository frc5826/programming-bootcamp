package com.avisautomata.problems.tests;

import com.avisautomata.problems.Operators;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_Operators {

    private final Operators operators;

    public Test_Operators(){
        this.operators = new Operators();
    }

    @Test
    public void testMultioperation() {
        for(int i = 0; i < 50; i++){
            double a = Math.random() * 100;
            double b = Math.random() * 100;
            double c = Math.random() * 100;
            assertEquals((b - c) / a, operators.multioperation(a, b, c),"Failed on " + a + ", " + b + " and " + c);
        }
    }

    @Test
    public void testDistance() {
        for(int i = 0; i < 50; i++){
            double a = Math.random() * 100;
            double b = Math.random() * 100;
            assertEquals(a * b, operators.calculateDistance(a, b), "Failed on " + a + " and " + b);
        }
    }

    @Test
    public void testRemaining() {
        for(int i = 0; i < 50; i++){
            double a = Math.random() * 100;
            double b = Math.random() * 100;
            assertEquals(100 - (a * b), operators.remainingTrip(a, b), "Failed on " + a + " and " + b);
        }
    }

    @Test
    public void testTrips() {
        for(int i = 0; i < 50; i++){
            int a = (int)(Math.random() * 100);
            assertEquals(a / 6, operators.howManyTrips(a), "Failed on " + a);
        }
    }

    @Test
    public void testLeft() {
        for(int i = 0; i < 50; i++){
            int a = (int)(Math.random() * 100);
            assertEquals(a % 6, operators.howManyLeft(a), "Failed on " + a);
        }
    }

    @Test
    public void testShouldExplore(){
        assertTrue(operators.shouldExplore(true, .5), "50% battery and on explorer duty, got false");
        assertFalse(operators.shouldExplore(true, .3), "30% battery and on explorer duty, got true");
        assertFalse(operators.shouldExplore(false, .1), "10% battery and not on explorer duty, got true");
        assertFalse(operators.shouldExplore(false, .80), "80% battery and not on explorer duty, got true");
    }

    @Test
    public void testShouldReturnHome(){
        assertTrue(operators.shouldReturnHome(11, .5), "50% battery and 11 cargo, got false");
        assertFalse(operators.shouldReturnHome(5, .3), "30% battery and 5 cargo, got true");
        assertFalse(operators.shouldReturnHome(1, .8), "80% battery and 1 cargo, got true");
        assertTrue(operators.shouldReturnHome(10, .8), "80% battery and 10 cargo, got false");
        assertTrue(operators.shouldReturnHome(10, .2), "20% battery and 10 cargo, got false");

    }

}
