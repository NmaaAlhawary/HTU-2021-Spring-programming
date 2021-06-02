package edu.htu.programming;

public class  Student extends Inher {
public double gpa;

public void print()
{
	System.out.println("your gpa"+gpa);
}
//overload
public void print(String massege)
{
	System.out.println(massege);
}
public void print (int age)
{
	System.out.println(age); 
}
}
