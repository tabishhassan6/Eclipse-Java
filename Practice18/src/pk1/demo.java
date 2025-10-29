package pk1;

public class demo {

	public static void main(String[] args)
	{
		A1.num2 = 5;
		System.out.println(A1.num2);
		
		A1 obj1 = new A1();
		A1 obj2 = new A1();
		A1 obj3 = new A1();
		
		
		obj1.num1= 1;
		obj2.num1 = 2;
		obj3.num1 = 3;
		
		System.out.println(obj1.num1);
		System.out.println(obj2.num1);
		System.out.println(obj3.num1);
		
		
		obj1.num2 = 66;
		obj2.num2= 88;
		obj3.num2= 99;
		System.out.println(A1.num2);
		System.out.println(A1.num2);
		System.out.println(obj3.num2);
		
		
		//obj1.increment();

	}

}
