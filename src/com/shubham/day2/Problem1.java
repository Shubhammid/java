package com.shubham.day2;

//This program defines a class Demo with a private static variable x shared by all objects of the class.
//The method fun1() assigns x = 5 and prints it. In the Problem1 class,
//the main() method creates an object d1 of Demo and calls fun1(), which prints 5 to the console.
//The program demonstrates the use of a static variable, object creation, and method calling in Java.


class Demo{
    private static int x;
    void fun1() {
      x= 5;
      System.out.println(x);
    }
}
public class Problem1 {
    public static void main(String[] args) {
       Demo d1 = new Demo();
       d1.fun1();
    }
}
