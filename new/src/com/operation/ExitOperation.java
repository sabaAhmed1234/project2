package com.operation;

import com.book.BookList;

public class ExitOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("خروج من النظام");
        System.exit(1);
    }
}
