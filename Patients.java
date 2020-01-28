import java.io.*;

import java.util.Random;

import java.util.Scanner;

 class Patient{

    double height,weight;

    double BMI(double height,double weight)

    {

        double bmi;

        bmi=((weight*703)/(height*height));

        return bmi;

    }

}

public class Patients {

    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);

        Patient p=new Patient();

        Random random=new Random();

        String a[][]=new String[10][2];

        String name;

        double height,weight;

        for(int i=0;i<10;i++)

        {

            name=sc.next();

            a[i][0]=name;

            height=Math.random();

            weight=Math.random();

            a[i][1]=Double.toString(p.BMI(height,weight));

        }

        for(int i=0;i<10;i++)

        {

            double x=Double.parseDouble(a[i][1]);

            if(x>25.0)

            System.out.println(a[i][0]+" "+a[i][1]);

        }

    }

}

