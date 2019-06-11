package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Aadhar {
	public static void main(String args[])
	{
		try
		{
			int count=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter the Aadhar Number:");
			Long Number=sc.nextLong();
			while(Number>0)
			{
				Number/=10;
				count+=1;
			}
			if(count<=11)
			{
				sc.close();
				throw new AadharNotFoundException();
			}
			else if(count==12)
			{
				System.out.println("Aadhar Number Matched.");
				System.out.println("Retrieving Details......");
			}
				sc.close();
		}
		catch(AadharNotFoundException e)
		{
			System.out.println("Not a valid Aadhar Number.");
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Only Numbers are Accepted!");
		}
	}
}
