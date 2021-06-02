package Programming;

import java.util.Scanner;

public class Procedural_Code {

	public static void main(String[] args) {
	Scanner number=new Scanner (System.in);
System.out.println("Enter your number :"); 
int num=number.nextInt();    //declar integer variable input 
double result=fact(num);   //calling the function 
System.out.println("Factorial of " +num + " is "+result);      //display the result 
	}

 static double fact(int num)   //declare a static  function that takes a variable and returns result
 {

	double factorial = 1;     //declare variable (factorial) and give it value
	 for(int i=1;i<=num;i++)    //while the for loop is true, execute the process )
	 {

	 	 factorial=factorial*i;
	 	 System.out.println(factorial);   //display the factorial
	 }


	 
	 return  factorial; 
	 	}
 	
}
