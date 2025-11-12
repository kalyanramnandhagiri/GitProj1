package com.nt.main;

import com.nt.config.ArithemeticOperations;
import com.sathya.welcome.Display;

public class TestClass 
{
	public static void main(String[] args)
	{
		ArithemeticOperations op=new ArithemeticOperations();
		System.out.println(op.add(12222l, 1111119l));
		System.out.println(op.sub(9999999l, 89000009l));
		System.out.println(op.mul(235, 5));
		System.out.println(op.div(1111111, 1000000));
		Display dis=new Display();
		System.out.println(dis.display("sathya"));	

	}

}
