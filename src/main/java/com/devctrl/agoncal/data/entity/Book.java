package com.devctrl.agoncal.data.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@NamedQueries({
        @NamedQuery(name = "findAllBooks", query = "select b from Book b"),
        @NamedQuery(name = "findBookH2G2", query = "select b from Book b where b.tittle = 'H2G2'")
})
public class Book {

    @Id @GeneratedValue
    private int id;
    private String title;
    @NotNull
    private Float price;
    @Size(min = 10, max =  2000)
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
