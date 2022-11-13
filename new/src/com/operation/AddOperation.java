package com.operation;

import com.book.Book;
import com.book.BookList;


public class AddOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("إضافة كتاب");
        System.out.println("الرجاء ادخال اسم الكتاب");
        String name=scan.next();
        System.out.println("الرجاء ادخال مؤلف الكتاب");
        String author=scan.next();
        System.out.println("الرجاء ادخال سعر الكتاب");
        int price=scan.nextInt();
        System.out.println("الرجاء ادخال نوع الكتاب");
        String type=scan.next();
        Book book=new Book(name,author,price,type);
        int pos= bookList.getUsedSize();
        bookList.setBooks(pos,book);
        bookList.setUsedSize(pos+1);




    }

}
