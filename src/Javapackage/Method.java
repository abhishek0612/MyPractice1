package Javapackage;

public class Method {
	
	 void printmess() {
		
		System.out.println("Hello Welcome to java");
		
	}
	 static int  sum(int a, int b) {
			
			//System.out.println("Sum of a & b:"+" "+(a+b));
			
			return (a+b);
		}
	 
	 static int minimum(int a,int b) {
		 
		 
		if(a>b)
			return a;
		else
			return b;
		
	 }
	 
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      Method test = new Method();
      
      test.printmess();
      
      int result = sum(10,30);
     System.out.println(minimum(10,20));
      
   
	}

	
	

}
