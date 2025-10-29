package pk1;

public class Second {

	public static void main(String[] args)
	{
		A1 a,b,c;
		A2 d,e,f;
		
		
		a = new A1();
		d = new A2();
		
		a.x = 100;
		a.d = 200;
		
		e = (A2) a;
		e.u = 500;
		
		
		System.out.println(a.x);
		System.out.println(a.d);
		System.out.println(e.x);
		System.out.println(e.d);
		System.out.println(e.u);
		

	}

}
