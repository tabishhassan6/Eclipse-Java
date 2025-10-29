package PK1;

public class A1
{
public int x;
public int y;
public static int z;


public A1() {
	
	x = 1;
	y = 2;
	z = 5;
	System.out.println("Im in constructor1");
}
public A1(int a) 
{
	x = 8888;
	y= 456;
	z = a;
	System.out.println("IM IN CONSTRUCTOr2");
}
public void hlp() {
	System.out.println("A1:hlp");
}
public static void dne()
{
	System.out.println("A1:dne");
}
}
