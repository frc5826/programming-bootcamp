package com.avisautomata.problems.tests;

public interface TestHook {

    void assertTrueHook(boolean b);

    void assertNotEqualsHook(int alpha, int o);

    void assertEqualsHook(int alpha, int beta);
}
