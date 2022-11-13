package com.book;

import java.util.Objects;

public class Book {
    private String name;
    private String author;
    private int price;
    private String type;
    private boolean isBorrowed;//false

    public Book(String name, String author, int price, String type) {


        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +" \'"+
                "،"+(isBorrowed==true?"اقرضت بالفعل ":"لم يتم اقراضها")+
                //", isBorrowed=" + isBorrowed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && isBorrowed == book.isBorrowed && name.equals(book.name) && author.equals(book.author) && type.equals(book.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, price, type, isBorrowed);
    }
}



