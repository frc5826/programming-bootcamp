package com.avisautomata.problems.tests;

import com.avisautomata.problems.Variables;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_Variables implements TestHook {

    private final Variables variables;

    public Test_Variables(){
        variables = new Variables(this);
    }

    @Test
    public void testSimple(){
        variables.simple();
    }

    @Test
    public void testReuse(){
        variables.reuse();
    }

    @Test
    public void testMultivariable(){
        variables.multivariable();
    }

    @Override
    public void assertTrueHook(boolean b) {
        assertTrue(b);
    }

    @Override
    public void assertNotEqualsHook(int alpha, int o) {
        assertNotEquals(alpha, o);
    }

    @Override
    public void assertEqualsHook(int alpha, int beta) {
        assertEquals(alpha, beta);
    }
}
