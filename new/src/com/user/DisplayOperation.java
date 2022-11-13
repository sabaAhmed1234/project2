package com.user;

import com.book.BookList;
import com.operation.IOperation;
public class DisplayOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("اظهار الكتب");
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            System.out.println(bookList.getBook(i));
        }
}}
