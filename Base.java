import java.io.*;
class Stock 
{
String s1;
String s2;
Double pp;
Double cp;

Stock(String s1,String s2,Double pp,Double cp)
{
this.s1=s1;
this.s2=s2;
this.pp=pp;
this.cp=cp;
}
double getChangePercentage()
{
  return (Math.abs(pp-cp)/pp)*100;

}
    }
public class Base
{  

public static void main(String args[])
{
 Stock s1=new Stock("choclate","cadbury",22.00,23.00);
 System.out.printf("Percentage change  :%.2f",s1.getChangePercentage());
 
  
}
}