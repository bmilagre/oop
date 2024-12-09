package ch.hslu.exercise.sw12;

import java.util.*;

public class Person implements Comparator<Person> {
    private final long id;
    private String firstName;
    private String lastName;
    private int age;

    public static void main(final String[] args){
        List<Person> people = new ArrayList<>();
        Person x = new Person(1, "Tom", "Muster", 12);

        people.add(x);
        people.add(new Person(2, "Alice", "Smith", 30));
        people.add(new Person(3, "Bob", "Johnson", 25));
        people.add(new Person(4, "Charlie", "Smith", 35));
        people.add(new Person(5, "Diana", "Brown", 20));

        // Sortierung nach Vorname
        System.out.println("Sort Vorname");
        Collections.sort(people, x.firstNameComp);
        people.forEach(System.out::println);

        System.out.println("");
        // Sortierung nach Nachname
        System.out.println("Sort Nachname");
        Collections.sort(people, x.lastNameComp);
        people.forEach(System.out::println);
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
        return "Person: " + this.firstName + " " + this.lastName;
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
    public int compare(final Person p1, final Person p2) {
        int compare = p1.getLastName().compareTo(p2.getLastName());
        if (compare == 0) {
            compare = p1.getFirstName().compareTo(p2.getFirstName());
        }
        return compare;
    }

    public final Comparator<Person> lastNameComp = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());

    public final Comparator<Person> firstNameComp = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
}
