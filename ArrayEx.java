
public class ArrayEx {

	public static void main(String[] args) 
	{
	int c=0,d=0;
	int m=0,n=0;
	int a[]= {153,6,109,303,496,204,9999,100,296,101};	
	for(int i=0;i<a.length;i++)
	{
		int count=0,sum=0,sum1=0,sum2=0;
		d=a[i];
		n=a[i];
		int length = String.valueOf(a[i]).length();
		if(a[i]%2==0)
		{
			System.out.println(a[i] +" is even");
		}
		else
			System.out.println(a[i] +" is odd");
		for(int j=1;j<=a[i]/2;j++)
		{
			if(a[i]%j==0)
			{
				sum+=j;
				count++;
			}
			else
				continue;
		}
		if(count>1)
			System.out.println(a[i] +" is not prime");
		else
			System.out.println(a[i] +" is prime");
		if(a[i]==sum)
			System.out.println(a[i] +" is perfect number");
		else
			System.out.println(a[i] +" is not perfect number");
		for(int k=0;k<length;k++)
		{
		sum1*=10;
		c=d%10;
		sum1=sum1+c;
		d/=10;
		}
		if(sum1==a[i])
			System.out.println(a[i] +" is a palindrome number");
		else
			System.out.println(a[i] +" is not a palindrome number");
		
		for(int l=0;l<length;l++)
		{
		m=n%10;
		sum2+=(m*m*m);
		n/=10;
		}
		if(sum2==a[i])
			System.out.println(a[i] +" is an armstrong number");
		else
			System.out.println(a[i] +" is not an armstrong number");
		
	}
	}

}
