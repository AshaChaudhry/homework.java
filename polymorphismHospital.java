package com.homework1;
//parent class polymorphismHospital
public class polymorphismHospital {
    void hospital(){
        System.out.println("Clementine Churchill=");
    }
}
//child class Department
class Department extends polymorphismHospital{
    void hospital(){
        System.out.println("Diffrent departments in Hospital:");
    }
}
//child subclass Consulting
class Consulting extends Department{
    void hospital(){
        System.out.println("(1)consulting Department");
    }
}
//child subclass Imaging
class Imaging extends Consulting{
    void hospital(){
        System.out.println("(2)Imaging department");
    }
}
//child subclass Patholody
class Pathology extends Imaging{
    void hospital(){
        System.out.println("(3)Pathology department");
    }
    public static void main(String[] args) {
        polymorphismHospital dpt=new polymorphismHospital();//accessing values from all subclasses
        dpt.hospital();
        polymorphismHospital dept=new Department();
        dept.hospital();
        polymorphismHospital dept1=new Consulting();
        dept1.hospital();
        polymorphismHospital dept2=new Imaging();
        dept2.hospital();
        polymorphismHospital dept3=new Pathology();
        dept3.hospital();
       // note-In polymorphism- method name should be same and new object is created with PARENT CLASS NAME

    }

    }