package com.book;

public class BookList {
    private Book[] books = new Book[10];
    //List<String> books;
    private int usedSize;

    public BookList() {
        books[0] = new Book("السلام عليك ي صاحبي", "ادهم الشرقاوي", 2500 ,"كتاب");
        books[1] = new Book("حاكم", "يوسف زيدان", 2000, "روايه");
        books[2] = new Book("ملهمون", "صالح بن محمد", 2256, "روايه");
        this.usedSize = 3;
    }

    public void setBooks(int pos,Book book) {
        books[pos] = book;
    }

    public void getBooks(int pos, Book book) {
        books[pos] = book;
    }

    public Book getBook(int pos) {
        return books[pos];
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }



}