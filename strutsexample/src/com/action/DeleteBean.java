package com.action;
import com.opensymphony.xwork2.ActionSupport;


public class DeleteBean extends ActionSupport 
{
	private String password;

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
	
}