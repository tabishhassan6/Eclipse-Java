package pk1;

public class Cast {

	public static void main(String[] args) 
	{
		byte b =127 ;
		int i = 257;
		double d = 323.142;{
			System.out.println("Conversion of int into byte ");
			b = (byte) i;
			System.out.println(b);
			
			System.out.println("Conversion of double into int ");
			
			i = (int)d;
			System.out.println(i);
		}
		
	
		
		/*b =(byte) i;
		System.out.println(b);
		
		float f = 5.6f;
	    int x = (int) f;
	    
	    System.out.println(x);*/
		
		

	}

}
