package com.homework1;

public class leftTriangle {
void leftangle(){
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
    }
        System.out.println("*");
    System.out.println("              **");
    System.out.println("             ***");
    System.out.println("            ****");
}
public static void main(String[] args) {

    leftTriangle angle=new leftTriangle();
    angle.leftangle();

}
}

