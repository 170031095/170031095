class Shape
{
   void draw()
{
   System.out.println("draw");
}
void erase()
{
    System.out.println("erase");
}
}
class Circle extends Shape
{
   void draw()
{
   System.out.println("circle draw");
}
void erase()
{
    System.out.println("circle erase");
}
}
class Triangle extends Shape
{
   void draw()
{
   System.out.println("Triangle draw");
}
void erase()
{
    System.out.println("Triangle erase");
}
}
class Square extends Shape
{
   void draw()
{
   System.out.println("Square draw");
}
void erase()
{
    System.out.println(" erase");
}
}
public class Shapes
 {
 public static Shape randshape()
 {
 switch((int)(Math.random()*3))
 {
 case 0: return new Circle();
 case 1: return new Square();
 case 2: return new Triangle();
 default : System.out.println("default");
 return new Shape();
 }
}
 public static void main (String arg[])
 {
 Shape s[] = new Shape[9];
 for(int i = 0;i< s.length; i++) 
s[i] = randshape();
 for(int i= 0;i < s.length; i++)
 s[i].draw();
 }
} 


    