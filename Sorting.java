import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("How many integers you want to enter:");
		int n=sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter "+n+" Values:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("The Un-Sorted array values are: ");
		for(int j=0;j<n;j++)
		{
			System.out.print(a[j]);
			if(j==n-1)
				System.out.print(".");
			else 
				System.out.print(", ");
		}
		//Arrays.sort(a);
		for(int j=0;j<n;j++)
		{
			for(int k=0;k<n;k++)
			{
				if(a[j]<a[k])
				{
				int temp=a[j];
				a[j]=a[k];
				a[k]=temp;
				}
			}
		}
		System.out.println();
		System.out.print("The Sorted array values are: ");
		for(int j=0;j<n;j++)
		{
			System.out.print(a[j]);
			if(j==n-1)
				System.out.print(".");
			else 
				System.out.print(", ");
		}
		sc.close();
	}

}
