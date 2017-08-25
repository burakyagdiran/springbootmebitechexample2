package com.burakyagdiran2.Entity;

public class Department { // Department sınıfı oluşturuldu

    private int d_id;
    private String d_name;
    private String description;
    private String d_employee;

    public Department(int d_id , String d_name , String description, String d_employee){

        this.d_id=d_id;
        this.d_name=d_name;
        this.description=description;
        this.d_employee=d_employee;
    }

    public Department(){}

    public int getD_id() { return d_id; }

    public void setD_id(int d_id) { this.d_id=d_id; }

    public String getD_name() { return d_name; }

    public void setD_name (String d_name) { this.d_name=d_name; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description=description; }

    public String getD_employee() { return d_employee; }

    public void setD_employee(String d_employee) { this.d_employee=d_employee; }

}
