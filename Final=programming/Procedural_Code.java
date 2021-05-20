package Programming;

import java.util.Scanner;

public class Procedural_Code {

	public static void main(String[] args) {
	Scanner number=new Scanner (System.in);
System.out.println("Enter your number :");
int num=number.nextInt();
double result=fact(num);
System.out.println("Factorial of " +num + " is "+result);
	}

 static double fact(int num)
 {

	double factorial = 1;
	 for(int i=1;i<=num;i++)
	 {

	 	 factorial=factorial*i;
	 	 System.out.println(factorial);
	 }


	 
	 return  factorial; 
	 	}
 	
}
