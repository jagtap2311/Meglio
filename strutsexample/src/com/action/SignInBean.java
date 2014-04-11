package com.action;
import com.opensymphony.xwork2.ActionSupport;


public class SignInBean extends ActionSupport 
{
	private String uname,password1;

	public String getUname()
	{
		return uname;
	}

	public void setUname(String uname)
	{
		this.uname = uname;
	}

	public String getPassword1()
	{
		return password1;
	}

	public void setPassword1(String password1)
	{
		this.password1 = password1;
	}
	
	
	
}