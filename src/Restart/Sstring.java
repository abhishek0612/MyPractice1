package Restart;

public class Sstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is an object that represents a sequence of characters
		
		//There is a 2 ways to create an object in string
		
		String s ="Hello java selenium";
		
		//Charat method 
		
		System.out.println(s.charAt(6));
		
		//Length method 
		System.out.println(s.length());
		
		//uppercase & lower case 
		System.out.println(s.toUpperCase());
		
		System.out.println(s.toLowerCase());
		
		//Replace method 
		
		System.out.println(s.replace("java", "Selenium"));
		
		//Get the letter position 
		System.out.println(s.indexOf("o"));
		
		//get the output after "j"
		System.out.println(s.substring(6));
		
		//get empty or not 
		System.out.println(s.isEmpty());
		
		//split 
		System.out.println(s.split("java"));
		
		//Reverse order 
		
		//for(int i=s.length()-1;i<s.length();i--) {
			
			//System.out.println(s.charAt(i));
		
		
		
		//get between the letter 
		System.out.println(s.subSequence(2, 6));

		
		//check the character sequence 
		System.out.println(s.contains("Hello"));
		
		
		String b = "   test";
		
		//trim method - to remove the white spaces 
		System.out.println(b.trim());
		
		//Check the start substrings 
		System.out.println(s.startsWith("Hell"));
		
		//Check the end substrings 
		System.out.println(s.endsWith("nium"));
		
		// To add the both strings 
		 String s1 = "Hello";
		 String s2 = "Java";
		 System.out.println(s1.concat(s2));
		 
		 System.out.println(s1.concat("you are welcome"));
		 
		 System.out.println(s1+s2);
		 
	}

}
