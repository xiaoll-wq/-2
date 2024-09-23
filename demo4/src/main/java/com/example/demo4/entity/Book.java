package com.example.demo4.entity;

public class Book {
    private Integer id;
    private String name;
    private String author;
    private String press;
    private String status;
    private String img;

    public Book(Integer id, String name, String author, String press, String status, String img) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.press = press;
        this.status = status;
        this.img = img;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
