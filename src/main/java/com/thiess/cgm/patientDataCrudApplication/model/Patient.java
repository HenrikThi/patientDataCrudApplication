package com.thiess.cgm.patientDataCrudApplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Patient {

    private @Id
    @GeneratedValue
    Long id;
    private String firstName;
    private String lastName;
    private String street;
    private String city;

    public Patient() {

    }

    public Patient(String firstName, String lastName, String street, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName+lastName+street+city);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Patient))
            return false;
        Patient that = (Patient)obj;
        return this.firstName.equals(that.firstName) && this.lastName.equals(that.lastName) && this.street.equals(that.street) && this.city.equals(that.city);
    }
}
