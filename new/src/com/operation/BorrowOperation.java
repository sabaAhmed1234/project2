package com.operation;

import com.book.Book;
import com.book.BookList;
  public class BorrowOperation implements IOperation{
      public void work(BookList bookList) {
          System.out.println("كتب الاقتراض");
          System.out.println("الرجاء ادخال عنوان الكتاب للاقتراض");
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
          book =  bookList.getBook(i);
          if(book.isBorrowed()) {
              System.out.println("تم الاقراض بنجاح");
          }else {
              book.setBorrowed(true);
              System.out.println("لم يتم الاقتراض");
          }
      }
  }
