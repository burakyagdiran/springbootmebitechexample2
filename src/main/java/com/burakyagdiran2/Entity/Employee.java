package com.burakyagdiran2.Entity;

public class Employee { // Employee sınıfı oluşturuldu

    private int e_id;
    private String name;
    private String surname;
    private int salary;

    public Employee(int e_id,String name, String surname , int salary ){

        this.e_id=e_id;
        this.name=name;
        this.surname=surname;
        this.salary=salary;
    }

    public Employee(){}

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) { this.e_id = e_id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
