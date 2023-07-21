package com.example.demo.dto;

public class DetailDto {
    private Long id;
    private String name;
    private String mail;
    private String status;

    public DetailDto(Long id, String name, String mail, String status) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.status = status;
    }


    public DetailDto() {
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
}
