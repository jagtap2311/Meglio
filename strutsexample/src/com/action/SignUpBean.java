package com.action;



import com.opensymphony.xwork2.ActionSupport;


public class SignUpBean extends ActionSupport 
{
	
	private static final long serialVersionUID = 1L;
	private String uname,password1,password2,EmailId,status,id;
	
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

	public String getPassword2()
	{
		return password2;
	}

	public void setPassword2(String password2)
	{
		this.password2 = password2;
	}

	public String getEmailId()
	{
		return EmailId;
	}

	public void setEmailId(String emailId)
	{
		EmailId = emailId;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	
}