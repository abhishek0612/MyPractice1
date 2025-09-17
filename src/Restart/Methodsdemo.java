package Restart;

public class Methodsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodsdemo d = new Methodsdemo();
		
		String name = getData();
		System.out.println(name);
		Methodsdemo2 d1 = new Methodsdemo2();
		d1.getuserData();
		getData2();
	
		
		

	}
	
	public static String getData() {
		
  System.out.println("Hello World");
  return "Hello Java";
	}

	public static String getData2() {
		
		  System.out.println("Getdata 2 method");
		  return "Hello Java";
			}
	
}
