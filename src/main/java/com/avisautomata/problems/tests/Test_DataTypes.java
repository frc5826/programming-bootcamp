package com.avisautomata.problems.tests;

import com.avisautomata.problems.DataTypes;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

public class Test_DataTypes {

    private DataTypes dataTypes;

    public Test_DataTypes(){
        dataTypes = new DataTypes();
    }

    Class[] c = {Double.TYPE, Integer.TYPE, Boolean.TYPE, String.class};
    Object[] v = {0, 0.5, false};

    @Test
    public void testCrates() {
        testTypeAndValue("crates", c[1], v[0]);
    }

    @Test
    public void testDistance() {
        testTypeAndValue("distance", c[0], v[1]);
    }

    @Test
    public void testFull() {
        testTypeAndValue("isFull", c[2], v[2]);
    }

    @Test
    public void testMessage() {
        System.out.println(testTypeAndValue("message", c[3], null, false));
    }

    public Object testTypeAndValue(String n, Class c, Object v) {
        return testTypeAndValue(n, c, v, true);
    }

    public Object testTypeAndValue(String n, Class c, Object v, boolean strictEquals){
        try {
            Field f = getField(DataTypes.class, n);
            if(!c.equals(f.getType())){
                fail("You defined \"" + n + "\" as a " + f.getType() + ". We're expecting a different type.");
            }
            if(strictEquals && !f.get(dataTypes).equals(v)){
                fail("You got the right type for \"" + n + "\" but didn't put the right starting value.");
            }
            else {
                assertNotNull(f.get(dataTypes));
            }

            return f.get(dataTypes);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            fail("Unable to find a variable named " + n);
            return null;
        }
    }

    private static Field getField(Class clazz, String fieldName)
            throws NoSuchFieldException {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            Class superClass = clazz.getSuperclass();
            if (superClass == null) {
                throw e;
            } else {
                return getField(superClass, fieldName);
            }
        }
    }

}
