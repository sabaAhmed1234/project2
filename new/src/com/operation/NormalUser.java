package com.operation;

import com.user.FindOperation;
import com.user.User;

import java.util.Scanner;

public class NormalUser extends User {

    public NormalUser(String name) {


            this.name = name;
            this.operations = new IOperation[]{
                    new ExitOperation(),
                    new FindOperation(),
                    new BorrowOperation(),
                    new ReturnOperation(),};
        }




    public int menu() {
        System.out.println("=========================");
        System.out.println("hello"+this.name+"مرحًبا بكم في نظام إدارة المكتبة");
        System.out.println("البحث عن كتب .1");
        System.out.println("اقتراض الكتب .2");
        System.out.println("إعادة الكتب .3");
        System.out.println("الخروج من النظام .0");
        System.out.println("=========================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }}




