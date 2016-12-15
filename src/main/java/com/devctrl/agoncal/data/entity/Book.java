package com.devctrl.agoncal.data.entity;

public class Book {

    private String title;
    private Float price;
    private String discritpion;
    private String number;

    public Book() {
    }

    public Book(String title, Float price, String discritpion) {
        this.title = title;
        this.price = price;
        this.discritpion = discritpion;
    }

    public Book(String title, Float price, String discritpion, String number) {
        this.title = title;
        this.price = price;
        this.discritpion = discritpion;
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDiscritpion() {
        return discritpion;
    }

    public void setDiscritpion(String discritpion) {
        this.discritpion = discritpion;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
