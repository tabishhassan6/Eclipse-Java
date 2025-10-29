package pk1;

public class A1 
{ 
		int num1;
		static int num2;
		
		public static  void increment() {
			
			num1++;// WE can not use non-static variable inside the static method
			System.out.println("A1:increment");
		}

}
