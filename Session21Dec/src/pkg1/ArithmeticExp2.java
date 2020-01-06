package pkg1;

public class ArithmeticExp2 {
	
		public int sub(int a,int b)
		{
			int c=a-b;
			System.out.println("First Expression gives :"+c);
			return c;
		}

	public int sum(int a1,int b1)
	{
		int c=a1+b1;
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
		System.out.println("final result of ((((10-2)+2)*2)-2)/2  gives  :"+c);
	}
		public static void main(String[] args) {
		ArithmeticExp2 Exp=new ArithmeticExp2();
		int sub_result=Exp.sub(10,2);
		int sum_result=Exp.sum(sub_result, 2);
		int mul_result=Exp.mul(sum_result, 2);
         int sub_resultnew=Exp.sub(mul_result, 2);
		Exp.div(sub_resultnew, 2);
		}
	}
		// TODO Auto-generated method stub

	

