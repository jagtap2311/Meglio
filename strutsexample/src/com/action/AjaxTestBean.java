package com.action;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

public class AjaxTestBean extends ActionSupport
{
private String user;

public String getUser()
{
	return user;
}

public void setUser(String user)
{
	this.user = user;
}

public String execute() throws Exception
{
	try{
		DAO d = DAO.getInstance();
	PreparedStatement ps=d.getPstm("select username from register where username='"+user+"'");
			
			ps.setString(1, user);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				return ERROR;
			}
				else
			{
					return SUCCESS;
			}
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return SUCCESS;
	}

}