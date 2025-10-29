package pk1;

public class A1 
 {
	public int x;
	
	public A1(int r)
	{
		x= r;
	}
	public A1(A1 u)
	{
		x = u.x+99;
	}
	
	public void prnt()
	{
		System.out.println(x);
		x = x+88;
	}

}
