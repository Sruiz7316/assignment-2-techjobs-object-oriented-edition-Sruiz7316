package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        try {
            assertNotEquals(job1, job2);
        } catch(Exception e) {
            fail("Job id generation failed. 2 classes are equal");
        }
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        // initialize parameters
        Job job = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));


        // compare
        try {
            assertEquals(job.getName(),"Product tester" );
            assertEquals(job.getEmployer().getValue(),"ACME");
            assertEquals(job.getLocation().getValue(), "Desert" );
            assertEquals(job.getPositionType().getValue(), "Quality control");
            assertEquals(job.getCoreCompetency().getValue(), "Persistence");
        } catch (Exception e) {
            fail("Job full constructor failed.");
        }
    }
    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        try {
            assertEquals(job1.equals(job2), false);
        } catch(Exception e) {
            fail("Failed at jobs equality");
        }
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        try {
            assertEquals(job.toString().substring(0, 1), "\n"); // compare first character to new line
            assertEquals(job.toString().substring(job.toString().length()-1), "\n");
        } catch(Exception e) {
            fail("fails at toString starts and Ends with new line");
        }
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        try {
            String toString = "\nID: " + job.getId() + "\n" +
                    "Name: Product tester\n" +
                    "Employer: ACME\n" +
                    "Location: Desert\n" +
                    "Position Type: Quality control\n" +
                    "Core Competency: Persistence\n";
            assertEquals(toString, job.toString());
        } catch(Exception e) {
            fail("Failed at toString");
        }
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("Product tester",
                new Employer(),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        try {
            String toString = "\nID: 3\n" +
                    "Name: Product tester\n" +
                    "Employer: Data not available\n" +
                    "Location: Desert\n" +
                    "Position Type: Quality control\n" +
                    "Core Competency: Persistence\n";
            System.out.println(job.toString());
            assertEquals(toString, job.toString());
        } catch(Exception e) {
            fail("Failed at toString");
        }
    }
}
