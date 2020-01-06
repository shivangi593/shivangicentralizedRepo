package pkg1;

public class ArithmeticExp {
	public int sum(int a,int b)
	{
		int c=a+b;
		System.out.println("First Expression gives :"+c);
		return c;
	}

public int sub(int a1,int b1)
{
	int c=a1-b1;
	System.out.println("Second Expression gives :"+c);
	return c;
}
public int mul(int a2,int b2)
{
	int c=a2*b2;
	System.out.println("Third expression gives :"+c);
	return c;
}
public void div(int a3,int b3)
{
	int c=a3/b3;
	System.out.println("final result of ((((10+2)-2)+2)*2)/2  gives  :"+c);
}
public static void main(String[]args)
{
	ArithmeticExp Exp=new ArithmeticExp();
	int sum_result=Exp.sum(10,2);
	int sub_result=Exp.sub(sum_result, 2);
	int sum_resultnew=Exp.sum(sub_result, 2);
	int mul_result=Exp.mul(sum_resultnew, 2);
	Exp.div(mul_result, 2);
	}
}
