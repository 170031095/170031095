import java.io.*;

import java.util.Scanner;

 class Person

 {

     String name;

     int age;

     

 }

 class Student extends Person{

     String collegename;

 }

 class Teacher extends Person{

     String subject;

     double salary;

     Teacher(String name,int age,String subject,double salary)

     {

         this.name=name;

         this.age=age;

         this.subject=subject;

         this.salary=salary;

     }

 }

 class CollegeStudent extends Student{

     int year;

     String major;

     CollegeStudent(String name,int age,String collegename,int year,String major)

     {

         this.name=name;

         this.age=age;

         this.collegename=collegename;

         this.year=year;

         this.major=major;

     }

 }

public class TestClass{

    public static void main(String []args){

        

        Teacher t=new Teacher("Rama",34,"english",20000);

        CollegeStudent cs=new CollegeStudent("swetha",19,"klu",2017,"communications");

        System.out.println("teacher details:"+"\t"+t.name+" "+t.age+" "+t.subject+" "+t.salary);

        System.out.println("student details:"+"\t"+cs.name+" "+cs.age+" "+cs.collegename+" "+cs.year+" "+cs.major);



        

    }

}

