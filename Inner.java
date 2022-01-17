package core.programs;

public class Inner {
private int data=30;  
	
	void display(){
		System.out.println("i am inside the outer class method");
	}
	 
	class Inner1{  		
	 private int data=20;
	  
	  void msg()
	  {
		  System.out.println("data is "+data);
	  }  
	  
	  void display(){
		  System.out.println("i am inside the inner class method");
	  }// inner class a
	
	public static void main(String args[]){  
	  
	  Inner obj=new Inner();    
	 }  
	}
}
