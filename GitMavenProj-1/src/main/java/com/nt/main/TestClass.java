package com.nt.main;

import com.nt.cfgs.NetBanking;
import com.nt.config.ArithemeticOperations;

public class TestClass 
{
	public static void main(String[] args)
	{
		ArithemeticOperations op=new ArithemeticOperations();
		System.out.println(op.add(12222l, 1111119l));
		System.out.println(op.sub(9999999l, 89000009l));
		System.out.println(op.mul(235, 5));
		System.out.println(op.div(1111111, 1000000));
		NetBanking nb=new NetBanking();
		System.out.println(nb.addBal(12345678, 20000));
	}
}
