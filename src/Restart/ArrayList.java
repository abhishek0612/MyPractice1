package Restart;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] test = {10,20,30,40,50};

		System.out.println("============Size of array==============");
		
		//Size of array
		System.out.println("Size of array:" + test.length);
		
		
		
		System.out.println("============2nd value of array==============");
		//Get value of 2nd array
		System.out.println("2nd value of array:"+test[3]);
		
		
		
		System.out.println("============All the values of array==============");
		
		//Get all the values of array
		
	for (int i=0;i<test.length;i++) {
		
		
		System.out.println("All the values of array:"+test[i]);
	}
	
	System.out.println("============Another array==============");
	
	String [] test2 = {"Hello","Java","Selenium","Automation"};
	
	 
		
for (int i=0;i<test.length;i++) {
		
		
		System.out.println(test2[i]);
	}
		
    
 int [] a = new int [5];
 
    a[0]=10;
	a[1]=20;
	a[3]=30;
	a[4]=40;
	a[5]=50;
	
	System.out.println(a.length);
		
System.out.println("============ArrayList==============");



	}

	
}
