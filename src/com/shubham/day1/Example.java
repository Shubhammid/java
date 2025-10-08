package com.shubham.day1;

public class Example {
    static void fun1(){
        System.out.println("A");
    }
    static void fun2(){
        System.out.println("B");
    }
    public static void main(String[] args) {
        System.out.println("C");
        fun1();
        fun2();
    }
}
