package com.homework1;

public class triangle {
    void righttriangle(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        triangle tri=new triangle();
        tri.righttriangle();
        }
    }
