package com.avisautomata.problems.tests;

import com.avisautomata.problems.Robot;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class Test_Robot {

    @Test
    public void testConstructor() {
        assertNotNull(createRobot(7));
    }

    @Test
    public void testPickupParameter() {
        Robot r = createRobot(7);
        try {
            Method m = r.getClass().getMethod("pickupCargo", Integer.TYPE);
            m.invoke(r, 2);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            fail("Unable to call the pickupCargo method to pickup 2 piece of cargo.");
        }
    }

    @Test
    public void testPickupNoParameter() {
        Robot r = createRobot(7);
        try {
            Method m = r.getClass().getMethod("pickupCargo");
            m.invoke(r);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            fail("Unable to call the pickupCargo method (no parameters)");
        }
    }

    @Test
    public void testDropCargo() {
        Robot r = createRobot(7);
        try {
            Method m = r.getClass().getMethod("dropCargo");
            m.invoke(r);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            fail("Unable to call the dropCargo method (no parameters)");
        }
    }

    @Test
    public void testGetCapacity(){
        for(int i = 0; i < 10; i++){
            Robot r = createRobot(i);
            try {
                Method m = r.getClass().getMethod("getCapacity");
                int capacity = (int)m.invoke(r);
                assertEquals(i, capacity, "Create a robot with a capacity of " + i + " but getCapacity tells us we have " + capacity);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
                fail("Unable to call the dropCargo method (no parameters)");
            }
        }
    }

    @Test
    public void testAddAndDrop(){
        Robot r = createRobot(10);

        try {
            Method m = r.getClass().getMethod("isFull");
            boolean full = (boolean)m.invoke(r);

            assertFalse(full, "Called isFull, expected the robot to return false");
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            fail("Unable to call the dropCargo method (no parameters)");
        }

        for(int i = 1; i <= 10; i++){
            try {
                Method m = r.getClass().getMethod("pickupCargo");
                m.invoke(r);

                m = r.getClass().getMethod("getCapacity");
                int capacity = (int)m.invoke(r);

                assertEquals(10 - i, capacity, "Called pickupCargo then getCapacity and the capacity didn't add up");
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
                fail("Unable to call the dropCargo method (no parameters)");
            }
        }

        try {
            Method m = r.getClass().getMethod("isFull");
            boolean full = (boolean)m.invoke(r);

            assertTrue(full, "Called isFull, expected the robot to return true");
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            fail("Unable to call the dropCargo method (no parameters)");
        }

        for(int i = 1; i <= 10; i++){
            try {
                Method m = r.getClass().getMethod("dropCargo");
                m.invoke(r);

                m = r.getClass().getMethod("getCapacity");
                int capacity = (int)m.invoke(r);

                assertEquals(i, capacity, "Called dropCargo then getCapacity and the capacity didn't add up");
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
                fail("Unable to call the dropCargo method (no parameters)");
            }
        }
    }

    private Robot createRobot(int capacity){
        try {
            Class<?> clazz = Class.forName("com.avisautomata.problems.Robot");
            Constructor<?> ctor = clazz.getConstructor(Integer.TYPE);
            Object object = ctor.newInstance(new Object[] { capacity });
            return (Robot) object;
        } catch (Exception e) {
            e.printStackTrace();
            fail("Unable to create an instance of your Robot. Check your constructor.");
            return null;
        }
    }

}
