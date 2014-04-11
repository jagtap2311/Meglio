package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class ForgotPassBean extends ActionSupport
{
private String EmailId;

public String getEmailId()
{
	return EmailId;
}

public void setEmailId(String emailId)
{
	EmailId = emailId;
}


}
