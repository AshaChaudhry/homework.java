package com.homework1;

public class InheritedList {
//child subclass DoctorsSpeciality is accessing values from other subclass and parent class
    public static void main(String[] args) {
DoctorsSpeciality doc= new DoctorsSpeciality();
        //InheritanceHospital doc=new InheritanceHospital();
doc.Hospital();
doc.Doctor();
doc.DocSpec();
    }
}
/*note- In Inheritance- method name should be diffrent in each class or subclass. and object is created with
LAST CHILD CLASS NAME*/