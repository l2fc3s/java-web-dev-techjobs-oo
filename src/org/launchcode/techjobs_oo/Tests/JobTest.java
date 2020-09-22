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

    //test if first and last char is blank
    @Test
    public void stringContainsBlankLineBeforeAndAfter(){
        Job toStringTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //System.out.println(toStringTest.toString());
        int endOfStringIndex = toStringTest.toString().length() - 1;
        assertTrue(toStringTest.toString().charAt(0) == toStringTest.toString().charAt(endOfStringIndex));
    }

    //should contain a label for each field, followed by the data stored in that field
    @Test
    public void stringContainsLabelAndData(){
        Job toStringTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String stringFormat =
                        "\nID: " + toStringTest.getId() + " \n"+
                        "Name: "+ toStringTest.getName() + " \n"+
                        "Employer: "+ toStringTest.getEmployer() + " \n"+
                        "Location: "+ toStringTest.getLocation() + " \n"+
                        "Position Type: "+ toStringTest.getPositionType() + " \n"+
                        "Core Competency: "+ toStringTest.getCoreCompetency() + " \n";

        assertEquals(toStringTest.toString(),stringFormat);
    }

    //If a field is empty, the method should add, “Data not available” after the label.
    @Test
    public void emptyFieldResultsInErrorMessage(){
        Job toStringTest = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        //System.out.println(toStringTest.toString());
        String stringFormat =
                "\nID: " + toStringTest.getId() + " \n"+
                        "Name: "+ "Data not available" + " \n"+
                        "Employer: "+ "Data not available" + " \n"+
                        "Location: "+ "Data not available" + " \n"+
                        "Position Type: "+ "Data not available" + " \n"+
                        "Core Competency: "+ "Data not available" + " \n";

        assertEquals(toStringTest.toString(),stringFormat);
    }

}
