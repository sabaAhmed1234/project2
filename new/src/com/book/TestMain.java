package com.book;

import com.operation.NormalUser;
import com.user.Admin;
import com.user.User;

import java.util.Scanner;


public class TestMain {
    public static User login() {

        Scanner scanner = new Scanner(System.in);
        //new GUL;
        System.out.println("الرجاء كتابة اسمك");
        String name = scanner.nextLine();
        System.out.println(" مستخدم عادي _ administrator :0 :الرجاء ادخال هويتك _1:");
        int who = scanner.nextInt();
        if(who == 1) {
            return new Admin(name);
        }else {
            return new NormalUser(name);}}
            public static void main(String[] args) {
                BookList bookList = new BookList();
                User user =  login();
                while (true) {
                    int choice = user.menu();//1
                    user.doOperation(choice,bookList);
                }
            }
        }


