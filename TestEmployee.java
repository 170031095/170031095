import java.io.*;

import java.util.Scanner;

 class Person

 {

     String name="swetha";

 }

class Employee extends Person

{

    double salary;

    int year;

    String insurance="1249000876";

    Employee(double salary,int year)

    {

        this.salary=salary;

        this.year=year;

    }

}

public class TestEmployee{

    public static void main(String []args){

        Employee e=new Employee(10,2000);

        System.out.println(e.name+" "+e.salary+" "+e.year+" "+e.insurance);

    }

}