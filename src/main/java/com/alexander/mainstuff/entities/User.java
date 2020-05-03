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
    
    @NotBlank(message = "Wwedite russkoye nazvanie")
    private String name;

    @NotBlank(message = "Wwedite proiznoscheniye")
    private String proiz_russian;

    @NotBlank(message = "Wwedite ivritskoye nazvanie")
    private String department;

    @NotBlank(message = "Wwedite proiznoscheniye")
    private String proiz_hebrew;



    public User() {}

    public User(String name, String proiz_russian, String department, String proiz_hebrew) {
        this.name = name;
        this.proiz_russian = proiz_russian;
        this.department = department;
        this.proiz_hebrew = proiz_hebrew;
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

    public String getProiz_russian() {
        return proiz_russian;
    }

    public void setProiz_russian(String proiz_russian) {
        this.proiz_russian = proiz_russian;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getProiz_hebrew() {
        return proiz_hebrew;
    }

    public void setProiz_hebrew(String proiz_hebrew) {
        this.proiz_hebrew = proiz_hebrew;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + proiz_russian + '\'' +
                ", department='" + department + '\'' +
                ", entry_date='" + proiz_hebrew + '\'' +
                '}';
    }
}
