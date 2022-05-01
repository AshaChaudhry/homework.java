package com.homework1;

public class pyramidTriangle {
    void triangle() {
        for (int i = 1; i <=5; i++) {
                for (int j = i; j <=5; j++) {
                    System.out.print(" ");
                }
                for(int k=1;k<i*2;k++){
                    System.out.print("*");
                }
            System.out.println(" ");
            }
        }


    public static void main(String[] args) {
        pyramidTriangle star=new pyramidTriangle();
        star.triangle();
    }
}
