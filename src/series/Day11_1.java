package series;

//Java Program to Print Upper Star Triangle Pattern
//*
//**
//***
//****
//*****

public class Day11_1 {
    public static void main(String[] args) {
         int n = 5;
         for(int i = 1; i <= n; i++){
             for(int j = 1; j <= i; j++){
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}
