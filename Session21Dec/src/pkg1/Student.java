package pkg1;

class Student {
	int age;
	int rollno;
	public void display()
	{
		System.out.println("welcome to all of you");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student deepak=new Student();
		deepak.age=23;
		System.out.println(deepak.age);
		deepak.rollno=12;
		System.out.println(deepak.rollno);
		deepak.display();
		

	}

}
