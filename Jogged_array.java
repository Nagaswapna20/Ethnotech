import java.util.Scanner;
class Jagged_array
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int[][] marks=new int[3][];
		marks[0]=new int[]{10};
		marks[1]=new int[]{20,30};
		marks[2]=new int[]{40,50,60,70,80};
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Student " + (i+1) + " marks: ");
			for(int j=0;j<marks[i].length;j++)
			{
				System.out.print(marks[i][j] +" ");
			}
			System.out.println();
		}
	}
}