package org.medellinjug.semillero.model;

public class Developer {

    private final Long id;
    private final String firstName;
    private final String lastName;


    public Developer() {
        super();
        id = 0L;
        firstName = "";
        lastName = "";
    }

    public Developer(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public Long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }



    @Override
    public String toString() {
        return "ID: " + id
                + " First Name: " + firstName
                + " Last Name: " + lastName;
    }
}
