package com.homework1;
//parent class InheritanceHospital
public class InheritanceHospital {
    String hospital="CLEMENTINE CHURCHILL HOSPITAL";
    void Hospital(){
        System.out.println( hospital );
    }
}

//child class is Dorctors
    class Doctors extends InheritanceHospital{
    void Doctor(){
        System.out.println("* doctors list:"+ "Mr Bailey"+", "+"Mr Shah");
    }
}
//child class is DoctorsSpeciality
        class DoctorsSpeciality extends Doctors{
   void DocSpec(){
        System.out.println("* Mr Bailey: Orthopedic Surgeon"+","+"Mr Shah: Gynecologist");}

}




