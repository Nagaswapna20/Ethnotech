import java.util.Scanner;
class Factorial
{
	static int fact(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		return n*fact(n-1);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.print(fact(n));
	}
}