package com.shubham.day3;

//This program defines a class B with an instance variable x (unique for each object) and a static variable y (shared by all objects).
// In main(), two objects b1 and b2 are created. The method b1.fun1() sets x = 5 (only for b1) and y = 22.
// Then b2.fun2() prints x of b2, which was never initialized, so it prints the default value 0.
// This demonstrates that instance variables are independent for each object, while static variables are shared across all objects.

class B{
    private int x;
    private static int y;
    void fun1(){
        y=22;
        x=5;
    }
    void fun2(){
        System.out.println(x);
    }
    void fun3(){
        y= 45;
    }
}
public class Problem2 {
    public static void main(String[] args) {
       B b1 = new B();
       B b2 = new B();
       b1.fun1();
       b2.fun2();
    }
}
