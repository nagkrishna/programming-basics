package operators;

public class operators {
	static int a=40;
	int b=20;
	public static void main(String[] args) {
		int c=60;
		operators op=new operators();
		if((a+op.b)==c)
		{
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
		a+=op.b;
		System.out.println(a);
		c=a>op.b?a:op.b;
		System.out.println(c);
		if(a==60 && op.b==20)
			System.out.println("correct");
		else
			System.out.println("incorrect");
	}

}
