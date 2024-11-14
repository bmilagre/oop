package ch.hslu.exercise.sw07;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private final long id;
    private String firstName;
    private String lastName;
    private int age;

    public static void main(final String[] args){
        Person x = new Person(3, "Tom", "Muster", 12);

        System.out.println(x.toString());
    }

    public Person(long id, String firstName, String lastName, int age) {
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
        return Objects.hash(this.id, this.firstName, this.lastName, this.age);
    }

    @Override
    public int compareTo(Person other) {
        return Long.compare(this.id, other.id);
    }
}
