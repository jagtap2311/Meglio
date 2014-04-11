package com.action;

import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.EncryptionDecryption;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class SignIn extends ActionSupport implements ModelDriven<SignInBean>, Preparable,SessionAware
{
	
	private static final long serialVersionUID = 1L;
	private SignInBean sb;
	private SessionMap<String, Object>sessionMap;

	public String execute() throws Exception
	{
		Boolean found=false;
		String email;

		try
		{
			DAO d = DAO.getInstance();
			
			ResultSet rs;
			PreparedStatement pst = d.getPstm("select password, key ,email from register where username=? and status='true' ");
			pst.setString(1, sb.getUname());
			rs=pst.executeQuery();
			while(rs.next()){
			String password=rs.getString(1);
		    Blob blob=rs.getBlob(2); 
		    email=rs.getString(3);
		   	EncryptionDecryption ed = new EncryptionDecryption(password, blob);   	
		   	password=ed.getDecryptedData();		
			d.closeConnection();
			if (sb.getPassword1().equals(password))
			{
				found = true;
				
			}
		}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		if(found==true)
		{
			sessionMap.put("usersession", sb.getUname());
			sessionMap.put("status",true);
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}

	public void prepare() throws Exception
	{
		sb = new SignInBean();
	}

	public SignInBean getModel()
	{
		return sb;
	}
	
	public void setSession(Map<String, Object> session)
	{
		sessionMap=(SessionMap<String, Object>)session;
	}
}