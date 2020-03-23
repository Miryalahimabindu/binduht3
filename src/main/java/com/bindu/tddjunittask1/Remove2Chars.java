package com.bindu.tddjunittask1;

public class Remove2Chars {

	public String removec(String string)
	{
		if(string.charAt(0)=='A'&& string.charAt(1)=='A')
		{
		    return string.substring(2);
		}
		else if(string.charAt(0)=='A'&& string.charAt(1)!='A')
		{
			return string.substring(1);
		}
		else if(string.charAt(0)!='A'&& string.charAt(1)=='A')
		{
			return string.charAt(0) + string.substring(2);
		}
		else
		{
		return string;
	  }
	}
}
