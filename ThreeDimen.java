import java.util.Scanner;

public class ThreeDimen {

	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of rows:");
		int x=sc.nextInt();
		System.out.println("Enter Number of columns:");
		int y=sc.nextInt();
		System.out.println("Enter Number of aisles:");
		int z=sc.nextInt();
		int a[][][]= new int[x][y][z];
		System.out.println("Enter "+x*y*z+ " Values:");
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				for(int k=0;k<z;k++)
				{
					a[i][j][k]=sc.nextInt();
				}
			}
		}
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				for(int k=0;k<z;k++)
				{
					sum+=a[i][j][k];
				}
			}
		}
		System.out.println("Sum is: "+sum);
		sc.close();
	}

}
