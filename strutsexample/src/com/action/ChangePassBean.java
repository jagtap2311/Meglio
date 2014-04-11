package com.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import freemarker.template.utility.Execute;

public class ChangePassBean extends ActionSupport 
{
	private String cp1,cp2;

	public String getCp1()
	{
		return cp1;
	}

	public void setCp1(String cp1)
	{
		this.cp1 = cp1;
	}

	public String getCp2()
	{
		return cp2;
	}

	public void setCp2(String cp2)
	{
		this.cp2 = cp2;
	}
	
	
}
