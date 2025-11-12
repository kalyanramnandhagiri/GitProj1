package com.nt.cfgs;

public class NetBanking
{
	long amt;
	
	public String addBal(long acNo,long amt)
	{
		return amt+"/rs- Successfully Added into the "+acNo;
	}
	public int remBal()
	{
		
		 int am=(int) (amt-200);
		
		return am;
	}
}
