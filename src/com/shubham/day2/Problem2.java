package com.shubham.day2;


//This program defines a class Demo1 with a private static variable x and a static method fun1().
// The method sets x = 10 and prints it. In the Problem2 class,
// the main() method directly calls Demo1.fun1() without creating an object because both the variable and method are static.
// The output is 10.

class Demo1{
    private static int x;
    static void fun1() {
        x= 10;
        System.out.println(x);
    }
}
public class Problem2 {
    public static void main(String[] args) {
        Demo1.fun1();
    }
}
