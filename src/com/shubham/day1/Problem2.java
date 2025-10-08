package com.shubham.day1;

class Day1 {
    void fun1(){
        System.out.println("Example 1");
    }
    void fun2(){
        System.out.println("Example 2");
    }
}
public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Main Method is here");
        Day1 d1 = new Day1();
        d1.fun1();
        d1.fun2();
    }
}
