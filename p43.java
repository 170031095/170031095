class RandomHelper 
{
static int rand;
static Double rand1;
static void randint(int a,int b)
{

rand = (int)(Math.random() * (b-a)) +a;

}
static void randdouble(int c,int d)
{
rand1 = (Math.random() * (d-c)) +c;

}
void display()
{
System.out.println("random int is:"+rand);
}
void display1()
{
System.out.println("random double is:"+rand1);
}
}

public class p43{
public static void main(String [] args)
{
RandomHelper r=new RandomHelper();
RandomHelper.randint(7,10);
RandomHelper.randdouble(7,10);
r.display();
r.display1();

} 

}
