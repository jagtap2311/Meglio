package com.action;

import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.EncryptionDecryption;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class Delete extends ActionSupport implements ModelDriven<DeleteBean>, Preparable, SessionAware
{

	private static final long serialVersionUID = 1L;
	private DeleteBean db;
	private SessionMap<String, Object> sessionMap;

	public String execute() throws Exception
	{
		Boolean found = false;
		String username;

		username = (String) sessionMap.get("usersession");
		try
		{

			DAO d = DAO.getInstance();
			ResultSet rs;
			PreparedStatement pst = d.getPstm("select password, key from register where username='"+username+"' ");
			rs = pst.executeQuery();
			rs.next();
			String password = rs.getString(1);
			Blob blob = rs.getBlob(2);
			EncryptionDecryption ed = new EncryptionDecryption(password, blob);
			password = ed.getDecryptedData();
			
			if (db.getPassword().equals(password))
			{
				found = true;
				PreparedStatement pstm = d.getPstm("delete from register where username='"+username+"' ");
				pstm.executeUpdate();
				
			}
			
			d.closeConnection();

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		if (found == true)
		{

			if (sessionMap != null)
				sessionMap.invalidate();
			return SUCCESS;

		}
		else
		{
			addFieldError(username,"Password Doesn't match");
			return ERROR;
		}
	}

	public void prepare() throws Exception
	{
		db = new DeleteBean();
	}

	public DeleteBean getModel()
	{
		return db;
	}

	public void setSession(Map<String, Object> session)
	{
		sessionMap = (SessionMap<String, Object>) session;
	}

}