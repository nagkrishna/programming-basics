import java.util.Scanner;

public class CharSort {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("How many rows you want to enter: ");
		int n=sc.nextInt();
		System.out.println("How many columns you want to enter: ");
		int m=sc.nextInt();
		char c[][]= new char[n][m];
		System.out.println("Enter "+n*m+" Characters: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
			c[i][j]=sc.next().charAt(0);
			}
		}
		char max = 'a'; 
		char min= 'z';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
		    if ( c[i][j]> max) 
	            max = c[i][j];
		    if(c[i][j]< min)
		    	min= c[i][j];
			}
		}
		System.out.println("Max Character is: "+max+" ,Min Character is: "+min);
		sc.close();
		}	
}