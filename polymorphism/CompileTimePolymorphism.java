package com.te.polymorphism;

public class CompileTimePolymorphism 
{
public static void main(String[] args) {
	CompileTimePolymorphism ctp =new CompileTimePolymorphism();
	System.out.println(ctp.multiply(2,3));
	System.out.println(ctp.multiply(4, 5, 6));

}

	public int multiply(int i , int j)
	{
		return i*j;
	}
	
	public int multiply(int i , int j, int k)
	{
		return i*j*k;
	}

}

