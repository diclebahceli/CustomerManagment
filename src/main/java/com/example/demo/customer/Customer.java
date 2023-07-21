package com.example.demo.customer;

public class Customer {
    private Long id;
    private String name;
    private String mail;
    private String status;
    private String phoneNumber;

    public Customer() {
    }


    public Customer(Long id, String name, String mail, String status, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.status = status;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
