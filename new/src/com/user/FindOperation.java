package com.user;

import com.book.Book;
import com.book.BookList;
import com.operation.IOperation;

  public class FindOperation implements IOperation{
      public void work(BookList bookList) {
          System.out.println("البحث عن كتاب");
          System.out.println("ادخل العنوان الذي تريد البحث فيه");
          String name = scan.next();
          int i = 0;
          Book book = null;
          for ( ;i < bookList.getUsedSize(); i++) {
              book = bookList.getBook(i);
              if(book.getName().equals(name)) {
                  break;}
                  if(i == bookList.getUsedSize()) {
                      System.out.println("لايوجد مثل هذا الكتاب");
                      return;
                  }
              book = bookList.getBook(i);
              System.out.println(book);
              System.out.println("هذه هو الكتاب المطلوب");
              }
          }
      }


