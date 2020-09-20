package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {
    public Job testJob1;
    public Job testJob2;
    @Before
    public void jobObjects(){
          testJob1 = new Job();
          testJob2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertEquals(testJob2.getId() - testJob1.getId(),1);
//        System.out.println(testJob1.getId());
//        System.out.println(testJob2.getId());
    }


    @Test
    public void testJobConstructorSetsAllFields() {
        Job constructorTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(constructorTest instanceof Job,true);
        assertEquals(constructorTest.getName() instanceof String, true);
        assertEquals(constructorTest.getEmployer().toString() instanceof String, true);
        assertEquals(constructorTest.getLocation().toString() instanceof String,true);
        assertEquals(constructorTest.getPositionType().toString() instanceof String,true);
        assertEquals(constructorTest.getCoreCompetency().toString() instanceof String,true);
        //System.out.println(constructorTest.getEmployer().toString() instanceof String);
    }

    @Test
    public void testJobsForEquality(){
        Job equalityTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job equalityTest2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(equalityTest.getId() == equalityTest2.getId());
//        System.out.println(equalityTest.getId());
//        System.out.println(equalityTest2.getId());
    }

}
