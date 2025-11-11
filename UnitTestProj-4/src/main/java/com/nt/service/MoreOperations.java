package com.nt.service;

import java.util.Date;

public class MoreOperations
{
	public boolean isPalindrome(String str)
	{
		if(str==null || str.length()==0 ||str.equalsIgnoreCase(""))
			throw new IllegalArgumentException("Invalid Input");
		String revStr=new StringBuffer(str).reverse().toString();
		if(str.equalsIgnoreCase(revStr))
			return true;
		else
			return false;
	}
	
	public Date showDateByMonth(int month)
	{
		if(month>=1 && month<=12)
			return new Date();
		else
			return null;
	}

}
