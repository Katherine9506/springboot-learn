package com.spring.springbootlearn.domain;

import javax.validation.constraints.NotEmpty;
import java.util.Objects;

public class Spitter {
    private Long id;
    @NotEmpty(message = "firstName tip")
    private String firstName;
    @NotEmpty
    private String lastName;
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;

    public Spitter() {
    }

    public Spitter(String firstName, String lastName, String username, String password) {
        this(null, firstName, lastName, username, password);
    }

    public Spitter(Long id, String firstName, String lastName, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spitter spitter = (Spitter) o;
        return Objects.equals(id, spitter.id) &&
                Objects.equals(firstName, spitter.firstName) &&
                Objects.equals(lastName, spitter.lastName) &&
                Objects.equals(getUsername(), spitter.getUsername()) &&
                Objects.equals(getPassword(), spitter.getPassword());
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstName, lastName, getUsername(), getPassword());
    }

    @Override
    public String toString() {
        return "Spitter{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
