package src;
public class Class2 {
public Class2()
{
	Class2Method();
	System.out.println("Class2 constructor is being called.");
}
protected void Class2Method()
{
	System.out.println("Class2 protected Method is invoked from default constructor.");
}
}
