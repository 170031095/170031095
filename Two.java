import java.io.*;

 class Fan{

    static int slow=1;

    static int medium=2;

    static int fast=3;

    private int speed=slow;

    private boolean on=false;

    private double radius=5;

    private String colour="red";

    Fan()

    {

        

    }

    void setspeed(int speed)

    {

        this.speed=speed;

    }

     void seton(boolean on)

    {

        this.on=on;

    }

     void setradius(double radius)

    {

        this.radius=radius;

    } 

    void setcolour(String colour)

    {

        this.colour=colour;

    }

    int getspeed()

    {

        return speed;

    }

    boolean geton()

    {

        return on;

    }

    double getradius()

    {

        return radius;

    }

    String getcolour()

    {

        return colour;

    }

}

public class Two extends Fan {

     

    public static void main(String args[]) {

       

        Fan f=new Fan();

        f.setspeed(3);

        f.seton(true);

        f.setradius(3);

        f.setcolour("black");

        System.out.print("speed is "+f.getspeed()+"\nstate is "+f.geton()+"\nradius is "+f.getradius()+"\ncolour is "+f.getcolour());

    }

}