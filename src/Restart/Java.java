package Restart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Primitive data types
		int num=5;
		char bnm='R';
		double kj=5.443;
		boolean mycard=true;
		
		
		//Non-primitive data types
		String URL ="Facebook Login";
		
		
		System.out.println("integar:"+num);
		System.out.println("character:"+bnm);
		System.out.println("double:"+kj);
		System.out.println("boolean:"+mycard);
		
		
		System.out.println("============Array======================");
		//Array : It can store multiple values in single variable.
		//2 types of array 
		
		int [] kl = {10,20,30,40,50};
		
		//int [] bnm = new int [5];
		
		
		//Total num of value
		System.out.println("Number of values in array:"+kl.length);
		
		
		//Get the any one value 
		System.out.println("Fourth index:"+kl[3]);
		
		for(int i=0; i<kl.length;i++) {
			
			System.out.println(i);
		}
		
		
		//For loop
		for(int i=0; i<kl.length;i++) {
			
			System.out.println(kl[i]);
		}
		
		String [] name = {"Abhi","Kalo","TEST","Build"};
		
		
              for(int i=2; i<name.length;i++) {
			
			System.out.println(name[i]);
		}
              
              
              
              
              
          int  [] Test = {1,2,3,4,5,6};    
          
          for(int b: Test)
          {
        	  System.out.println(b);
          }

          
          System.out.println("================Another if else condition=============="); 
          
          //Get the values which is multiple by 2 
          
          int [] divide = {1,2,3,4,5,6,7,8,9,10};
          
          for(int i=0;i<divide.length;i++) 
          {
        	  
          //    System.out.print(divide[i]);  
          }
          
          
          ArrayList<String> a = new ArrayList<String>();
          
          a.add("Sunil");
          a.add("Mukesh");
          a.add("Selenium");
          a.add("Java");
          a.add("Test");
          
          //want to remove index 2 
          a.remove(2);
          
          //for(int i=0;i<a.size();i++)
          //System.out.println(a.get(i));
          
          for(String val:a)
          {System.out.println(val);
          
	}
          
          //Items present in ArrayList or not, In console showing true if data is available in arraylist
          System.out.println(a.contains("Sunil"));
	     
          
          //Convert normal arry to arraylist
          String [] rt = {"Hello1","Hello2","Hello3","Hello4"};
          List<String> rtArrayList=  Arrays.asList(rt);
          rtArrayList.contains("Hello3");
          
          

          
            
}}
