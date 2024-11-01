/*
 * Copyright (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ch.hslu.exercise.sw07;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    /**
     * Checks if the id is not null.
     */
    @Test
    void testIfIdIsNotNull() {
        Person examplePerson = new Person(79858, "Max", "Muster", 25);
    }

    /**
     * Checks if the id is correctly randomized and is not generated twice.
     */
    @Test
    void testIfIdIsRandomized() {
        Person examplePerson1 = new Person(79858, "Max", "Muster", 25);
        Person examplePerson2 = new Person(888755, "Tom", "Muster", 22);

        assertTrue(examplePerson1.getId() != examplePerson2.getId());
    }

    /**
     * Checks if the generated Object is of type Person.
     */
    @Test
    void testIfClassReturnsObjectOfTypePerson() {
        Person examplePerson = new Person(79858, "Max", "Muster", 25);

        assertTrue(examplePerson instanceof Person);
    }

    /**
     * Checks if the correct firstname from the constructor is output.
     */
    @Test
    void testIfCorrectFirstNameIsReturned() {
        Person examplePerson = new Person(79858, "Max", "Muster", 25);

        assertTrue(examplePerson.getFirstName().equals("Max"));
    }

    /**
     * Checks if the correct lastname from the constructor is output.
     */
    @Test
    void testIfCorrectLastNameIsReturned() {
        Person examplePerson = new Person(79858, "Max", "Muster", 25);

        assertEquals(true, examplePerson.getLastName().equals("Muster"));
    }

    /**
     * Checks if the firstname has changed correctly and setFirstName method works.
     */
    @Test
    void testIfFirstNameHasChangedCorrectly() {
        Person examplePerson = new Person(79858, "Max", "Muster", 25);
        examplePerson.setFirstName("Tom");

        assertTrue(examplePerson.getFirstName().equals("Tom"));
    }

    /**
     * Checks if the lastname has changed correctly and setLastname method works.
     */
    @Test
    void testIfLastNameHasChangedCorrectly() {
        Person examplePerson = new Person(79858, "Max", "Muster", 25);
        examplePerson.setLastName("Meier");

        assertTrue(examplePerson.getLastName().equals("Meier"));
    }

    /**
     * Checks if the correct lastname from the constructor is output.
     */
    @Test
    void testIfCorrectAgeIsReturned() {
        Person examplePerson = new Person(79858, "Max", "Muster", 25);
        assertTrue(examplePerson.getAge() == 25);
    }

    /**
     * Checks if the age has changed correctly and setAge method works.
     */
    @Test
    void testIfAgeHasChangedCorrectly() {
        Person examplePerson = new Person(79858, "Max", "Muster", 25);
        examplePerson.setAge(21);

        assertTrue(examplePerson.getAge() == 21);
    }

    @Test
    void equalsContract() {
        EqualsVerifier.simple().forClass(Person.class).verify();
    }

    @Test
    void testIfObjectEqualsPersonObject() {
        Person examplePerson = new Person(79858, "Max", "Muster", 25);
        assertTrue(examplePerson.equals(examplePerson));
    }

    @Test
    void testIfObjectNotEqualsPersonObject() {
        Person examplePerson = new Person(79858, "Max", "Muster", 25);
        Object exampleObject = new Object();
        assertFalse(examplePerson.equals(exampleObject));
    }

    /**
     * Checks if the generated hashcode is the same on the same object
     */
    @Test
    void testIfPersonIsTheSameViaHashCode() {
        Person examplePerson = new Person(79858, "Max", "Muster", 25);
        assertEquals(examplePerson.hashCode(), examplePerson.hashCode());
    }

    /**
     * Checks if the generated hashcode is not the same when age differs.
     */
    @Test
    void testIfTheHashCodeIsNotEqualsWhenAgeDiffers(){
        Person examplePerson1 = new Person(79858, "Max", "Muster", 25);
        Person examplePerson2 = new Person(7985898, "Max", "Muster", 21);
        assertNotEquals(examplePerson1.hashCode(), examplePerson2.hashCode());
    }

    /**
     * Checks if the person is the same by checking via compareTo.
     */
    @Test
    void testIfPersonIsTheSame(){
        Person examplePerson1 = new Person(79858, "Max", "Muster", 25);
        Person examplePerson2 = new Person(79858, "Max", "Muster", 25);
        assertEquals( 0, examplePerson1.compareTo(examplePerson2));
    }

    /**
     * Checks if the person is not the same by checking via compareTo.
     */
    @Test
    void testIfPersonIsNotTheSame(){
        Person examplePerson1 = new Person(79858, "Max", "Muster", 25);
        Person examplePerson2 = new Person(99846, "Tom", "Muster", 21);
        assertEquals( -1, examplePerson1.compareTo(examplePerson2));
    }
}