package core.programs;

class Calculate {
	public void add(int a,int b)
    {
         System.out.println("Add two nuumers : "+(a+b));
    }
    
	
	public void area(int l,int b)
    {
         System.out.println("Area of Rectangle : "+(l*b));
    }
    
	public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Calculate ob = new Calculate();
	      ob.add(10,12);
	      ob.area(5); 
	      ob.area(345);
		

	}

}
