/*
 * Copyright (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ch.hslu.exercise.sw07;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private final long id;
    private String firstName;
    private String lastName;
    private int age;

    public Person(final long id, final String firstName, final String lastName, final int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public long getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " + super.toString();
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if(!(object instanceof Person person)) {
            return false;
        }

        return Objects.equals(person.id, this.id) && Objects.equals(person.firstName, this.firstName) && Objects.equals(person.lastName, this.lastName) && (person.age == this.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id,this.firstName, this.lastName, this.age);
    }

    @Override
    public int compareTo(Person other) {
        return Long.compare(this.id, other.id);
    }
}
