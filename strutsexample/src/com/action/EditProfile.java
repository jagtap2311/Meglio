package com.action;

import java.sql.PreparedStatement;

import com.opensymphony.xwork2.ActionSupport;

public class EditProfile extends ActionSupport
{
@Override
public String execute() throws Exception
{
	try{
	DAO d = DAO.getInstance();
	PreparedStatement ps=d.getPstm("insert into profile values (?,?,?,?,?)");
	
	}
	catch(Exception e){}
	return SUCCESS;
}
}
