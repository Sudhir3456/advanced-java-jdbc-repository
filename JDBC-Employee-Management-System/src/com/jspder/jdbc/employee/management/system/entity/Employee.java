package com.jspder.jdbc.employee.management.system.entity;


public class Employee {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String dob;

    // Constructor
    public Employee() {}

    public Employee(int id, String name, String email, String phone, String dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", dob=" + dob + "]";
    }
}