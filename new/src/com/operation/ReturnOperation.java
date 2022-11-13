package com.operation;

import com.book.Book;
import com.book.BookList;
public class ReturnOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("ارجاع الكتاب");
        System.out.println("ادخل عنوان الكتاب المراد ارجاعه");
        String name = scan.next();
        int i = 0;
        Book book = null;
        for ( ;i < bookList.getUsedSize(); i++) {
            book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                break;
            }
        }
        if(i == bookList.getUsedSize()) {
            System.out.println("لايوجد مثل هذا الكتاب");
            return;
        }
        book = bookList.getBook(i);
        if(book.isBorrowed()) {
            book.setBorrowed(false);
            System.out.println("لقد تمت عملية ارجاع الكتب");
        }else {
            System.out.println("لم تتم اعادة الكتاب");
        }
}}
