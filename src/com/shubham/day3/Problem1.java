package com.shubham.day3;

//This program defines a class A with an instance variable x and a static variable y shared by all objects of the class.
// The method fun1() sets y = 22, fun3() changes it to 45, and fun2() prints its current value. In main(),
// two objects a1 and a2 are created. First, a1.fun1() sets y to 22, then a2.fun3() changes y to 45 (affecting all objects since y is static),
// and finally a1.fun2() prints 45. This demonstrates that static variables are shared among all objects of a class.

class A{
    int x;
    private static int y;
    void fun1(){
        y=22;
    }
    void fun2(){
        System.out.println(y);
    }
    void fun3(){
        y= 45;
    }
}
public class Problem1 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        a1.fun1();
        a2.fun3();
        a1.fun2();
    }
}
