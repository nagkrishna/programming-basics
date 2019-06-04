package operators;

public class OpMeth {
	public static void fun1()
	{
		System.out.println("No parameter,return type static method");
	}
	public void fun11()
	{
		System.out.println("No parameter,return type Non-static");
	}
	public static void fun2(int a)
	{
		System.out.println("Static, No return type with parameter="+a);
	}
	public void fun22(int a)
	{
		System.out.println("Non-Static, No return type with parameter="+a);
	}
	public static int fun3()
	{
		int b=100;
		System.out.println("Static, No parameter with return type int");
		return b;
	}
	public int fun33()
	{
		int b=10;
		System.out.println("Non-static, No parameter with return type int");
		return b;
	}
	public static int fun4(int a, int b)
	{
		System.out.println("Static, with parameter,return type");
		return a+b;
	}
	public int fun44(int a, int b)
	{
		System.out.println("Non-static, with parameter,return type");
		return a/b;
	}
	public static void main(String[] args) 
	{
		OpMeth op=new OpMeth();
		fun1();
		op.fun11();
		fun2(20);
		op.fun22(10);
		fun3();
		op.fun33();
		fun4(5,6);
		op.fun44(16,8);

	}

}
