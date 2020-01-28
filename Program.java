public class RandomHelper
{
	public static void randit()
	{
		int ra1,ra2;
		int rand;
		Console.WriteLine("Enter the two Integral values");
        ra1=int.Parse(Console.ReadLine());
		ra2=int.Parse(Console.ReadLine());
		Random random=new Random();
	    rand=random.Next(ra1,ra2);
		Console.WriteLine("The RANDOM NUMBER IN INTEGER FORM {0}",rand);
    }
	public static void randdouble()
	{
		int ra11,ra22;
		int rand1;
		Console.WriteLine("Enter the two Integral values");
        ra11=int.Parse(Console.ReadLine());
		ra22=int.Parse(Console.ReadLine());
		Random random=new Random();
	    rand1=random.Next(ra11,ra22);
		Console.WriteLine("The Random Double Numbers={0}",random.NextDouble()*rand1);
        //Console.WriteLine("The Random double numbers = {0}",random.NextDouble()*(ra22-ra11) + ra11);
    }
}
	public class Program
	{
	public static void Main()
	{
		RandomHelper.randit();
		RandomHelper.randdouble();
		
	}
	}
