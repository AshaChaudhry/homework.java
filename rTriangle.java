package com.homework1;

public class rTriangle {
    void Righttriangle(){

        for(int i=1;i<=3;i++){
            for (int j=1;j<=i;j++){
            System.out.print("*");

               // System.out.println("**");
            for(int k=2;k<=j;k++){
               System.out.println("*");

                }
            }
        }

            }

        public static void main(String[] args) {
        rTriangle triangle=new rTriangle();
        triangle.Righttriangle();
    }

}
