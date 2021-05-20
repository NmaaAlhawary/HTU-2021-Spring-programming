package Programming;

import java.util.Scanner;

public class Part1 {       //Encrypted and decrypted code

	public static void main(String[] args) {
	
		 Scanner statment= new Scanner(System.in);     
		 System.out.println("Enter your out:");           
		 String input=statment.next();   //Declare string variable (input)
		 String name="";        //Declare string variable (name)
		
		char [] arrayChars= input.toCharArray();   //Declare array of character (ArrayChars) to put all the Contents of (input )on it
		System.out.println(arrayChars);            //display/ print ArrayChars
		System.out.print("Encrypted: ");
		for (char c:arrayChars)  {                 // 1. Use for loop statement  

                                             //2.while the for loop is true, execute the statement (print the encryption) 
		
		c-=1;                //decrease 1 of c
		name+=c;          //put the  Contents of c in name
		  //print(c) encrypted
			
		}
		System.out.print(name);
		char [] decrypted= name.toCharArray();   //Declare array of character (Decrypted) to put all the Contents of (name )on it 
		System.out.println();
		System.out.print("Decrypted:");
		for(char m:decrypted)   //2.while the for loop is true, execute the statement (print the Decrypted ) 
			
		{
		m+=1;            //increase 1 of c
	
			System.out.print(m);
		
		}
	
	}
}
	
	
