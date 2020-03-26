package com.alexander.mainstuff.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank(message = "Bitte geben sie ihren Namen an")
    private String name;

    @NotBlank(message = "Bitte geben sie ihre Email an")
    private String email;

    @NotBlank(message = "Bitte geben sie ihre Firmenabteilung an")
    private String department;

    @NotBlank(message = "Bitte geben sie ihr Eintrittsdatum an")
    private String entry_date;



    public User() {}

    public User(String name, String email, String department, String entry_date) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.entry_date = entry_date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEntry_date() {
        return entry_date;
    }

    public void setEntry_date(String entry_date) {
        this.entry_date = entry_date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", entry_date='" + entry_date + '\'' +
                '}';
    }
}
