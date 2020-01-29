import java.io.*;
import java.util.Scanner;
class fruit
{
   protected String name,taste,size;
   Scanner sc=new Scanner(System.in);
  public void eat()
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("name of fruit is");
     name=sc.next();
     System.out.println("taste of fruit is");
     taste=sc.next();
     System.out.println("name"+name);
     System.out.println("taste"+taste);
   }
}
class apple extends fruit
{
   public void eat()
{
      System.out.println("name of fruit is orange");
      System.out.println("taste of fruit is sour");
}
}
class orange extends fruit
{
   public void eat()
{
      System.out.println("name of fruit is orange");
      System.out.println("taste of fruit is sour");
}
}
class p72
{
   public static void main(String args[])
{
   apple a=new apple();
a.eat();
orange o=new orange();
o.eat();
}
}
     