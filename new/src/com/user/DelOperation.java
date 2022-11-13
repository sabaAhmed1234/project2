package com.user;

import com.book.Book;
import com.book.BookList;
import com.operation.IOperation;

public class DelOperation implements IOperation{
    public void work(BookList bookList) {

        System.out.println("حذف الكتب");
        System.out.println("ادخل الكتاب المراد حذفة");
        String name = scan.next();
        int i = 0;
        Book book = null;
        for (; i < bookList.getUsedSize(); i++) {
            book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                break;


            }
        }

        if (i == bookList.getUsedSize()) {
            System.out.println("لا يوجد مثل هذا الكتاب");
            return;
        }

        for (int j = i; j < bookList.getUsedSize() - 1; j++) {
            book = bookList.getBook(j + 1);
            bookList.setBooks(j,book);
        }
        int curSize = bookList.getUsedSize();
        bookList.setUsedSize(curSize-1);
        System.out.println("تم الحذف بنجاح");
    }}