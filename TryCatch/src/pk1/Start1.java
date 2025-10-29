package pk1;
import java.io.*;

public class Start1 {

	public static void main(String[] args)
	{
		int x,y,z;
		x = 10;
		y = 0;
		z =0;
		try {
			z = (int) x/y;
			System.out.println(z);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
