

package com.user;

import com.operation.AddOperation;
import com.operation.ExitOperation;
import com.operation.IOperation;

import java.util.Scanner;

public class Admin extends User{
    public Admin(String name) {
    this.name = name;
    this.operations = new IOperation[]{
            new ExitOperation(),
            new FindOperation(),
            new AddOperation(),
            new DelOperation(),
            new DisplayOperation()
    };
    }
    public int menu() {
        System.out.println("=========================");
        System.out.println(" hello "+this.name+"مرحًبا بكم في نظام إدارة المكتبة ");
        System.out.println("البحث عن كتب _1");
        System.out.println("حذف كتاب _2");
        System.out.println("عرض كافة الكتب _3");
        System.out.println("الخروج من النظام_0");
        System.out.println("=========================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;


        }}