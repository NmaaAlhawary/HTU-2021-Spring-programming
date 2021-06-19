package programming;

import java.util.Scanner;

public class Part3 {

	public static void main(String[] args) {
		
		 Scanner statment= new Scanner(System.in);     
		 System.out.println("Enter your name:");           
		 String name=statment.next();   //Declare string variable (input)
		 Scanner out= new Scanner(System.in);     
		 System.out.println("Enter your ID:");           
		 String id=out.next(); 
         System.out.println("Enter numbers of your subject:");
			
		 Scanner marks= new Scanner(System.in);    
		 int numbersOfSubject=marks.nextInt(); 
			

	double sum=0;
	        for(int i = 1; i <= numbersOfSubject; i++)
	        {
	        	 System.out.println("Enter  your " + i + " marke :"); //enter your mark from 100
	        	 
	        	double mark=marks.nextDouble(); 
	        	
	        sum=sum+mark;
	        }
	        sum=sum/numbersOfSubject;
	       double avarage= sum/100*4;
	        System.out.println("your GPA :"+ avarage );
	        
	        //Grades Criteria:
	       
	        //Between 3.6 – 4   D
	        //Between 2.8 – 3.59  M
	        //Between 2.4 – 2.8  P
	        //Between less than 2.4  U
	  
	    
	        String grades="";
	        if ((avarage>=3.6)&&(avarage<=4.0) ){
	        grades="D";
	        System.out.println("Your GPA is: "+ grades );
	        }
	        else  if  ((avarage>=2.8) &&( avarage< 3.6)) {
	        grades="M";
	        System.out.println("Your GPA is: "+grades);
	        }
	        else if  ((avarage>=2.4) &&( avarage<2.8)) {
	        	grades="P";
	        	  System.out.println("Your GPA is: "+grades);
	        }
	      
	     
	        else if(avarage<2.4)
	        {
	        	grades="U";
	        	  System.out.println("Your GPA is: "+ grades );
	        }
	        
	        else {
	        	  System.out.println(" Invalid ");
	        }
	        
	     
	
	      
}
}
