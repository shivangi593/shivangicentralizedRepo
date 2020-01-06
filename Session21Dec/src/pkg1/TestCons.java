package pkg1;

public class TestCons {
	public TestCons()
	{
		this(22,23,41);
		System.out.println("this is default constructor");
	}
	public TestCons(int a)
	{
		this();
		System.out.println("this is 1 parameterized constuctor");

	}
public TestCons(int a,int b)
{
	this(22);
	System.out.println("this is 2 parameterized constructor");
}
public TestCons(int a,int b,int c)
{
System.out.println("This is 3 parameterized constructor");	
}
	public static void main(String[] args) {
		TestCons t1=new TestCons(33,23);
		// TODO Auto-generated method stub

	}

}
