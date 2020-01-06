package pkg1;

public class ConstMethodThis {
	public void method1()
	{
	this.method4(11, 10, 9);
		System.out.println("Default Method");
	}
	public void method2(int a)
	{
		this.method1();
		System.out.println("1 parameterized Method");
	}
	public void method3(int a,int b)
	{
		this.method2(11);
		System.out.println("2 parameterized Method");
	}
	public void method4(int a,int b,int c) {
	
		System.out.println("3 parameterized Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstMethodThis obj=new ConstMethodThis();
obj.method3(22,11);
	}

}
