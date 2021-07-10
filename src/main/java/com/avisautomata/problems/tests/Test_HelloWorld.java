package com.avisautomata.problems.tests;

import com.avisautomata.problems.HelloWorld;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class Test_HelloWorld {

    private class TestStream extends PrintStream {

        private final List<String> capture;

        public TestStream(List<String> capture) {
            super(System.out);
            this.capture = capture;
        }

        @Override
        public void println(String x) {
            capture.add(x);
            super.println(x);
        }

    }

    private final HelloWorld helloWorld;

    public Test_HelloWorld() {
        helloWorld = new HelloWorld();
    }

    @Test
    public void testSayHello(){
        List<String> out = new LinkedList<>();
        System.setOut(new TestStream(out));
        helloWorld.sayHello();
        System.setOut(System.out);
        assertTrue(out.contains("Hello World!"), "Didn't find \"Hello World!\" in the output: " + out);
    }

}
