package core.programs;

public class DataTypeProgram {

	public static void main(String[] args) {
	
		boolean status = true;
		System.out.println("i am printing status " + status);
		
		int i = 100;
		long l = i;
		System.out.println("long value "+ l);
	
		char t=(char) i;
		System.out.println("char value " + t);
		
		double d= 1906.7867;
		float r= (float) d;
		System.out.println("float value " + r);
		System.out.println("double value " + d);
		
		double d2= 1906.7867;
		long l2= (long)d2;
		int i2= (int)l2;
		System.out.println("double value " +d2);
		System.out.println("long value " +l2);
		System.out.println("int value " +i2);
		
		float f =l;
		System.out.println("float value " + f);
		
		byte b;
		int ii = 256;
		double dd = 344.345;
	
		System.out.println("Conversion of int to byte ");
		b = (byte) ii;
		System.out.println("ii = " +ii +" b = " +b);
		
		System.out.println("Conversion of double to byte ");
		b = (byte) dd;
		System.out.println("dd = " +dd +" b = " +b);
		
		
	}
}
   