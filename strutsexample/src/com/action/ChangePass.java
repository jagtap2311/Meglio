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
public class ChangePass extends ActionSupport implements ModelDriven<ChangePassBean>, Preparable,SessionAware
{
	
	private static final long serialVersionUID = 1L;
	private ChangePassBean sb;
	private SessionMap<String, Object> sessionMap;
	int i=0;
	public String execute() throws Exception
	{
		Boolean found = false;
		String username;
		String password;
		String emailid;
		Blob blob;
		username = (String) sessionMap.get("usersession");
		try
		{
			
			DAO d = DAO.getInstance();
			ResultSet rs;
			PreparedStatement pst = d.getPstm("select password, key,email from register where username='"+username+"' ");
			rs = pst.executeQuery();
			found=rs.next();
			while(found){
			password = rs.getString(1);
			blob = rs.getBlob(2);
			emailid=rs.getString(3);
			EncryptionDecryption ed = new EncryptionDecryption(password, blob);
			password = ed.getDecryptedData();
			if (sb.getCp1().equals(password))
			{	 
				EncryptionDecryption eds = new EncryptionDecryption(sb.getCp2());
				PreparedStatement pstm = d.getPstm("update register SET password=? , key=? where username=? and status='true'");
			    pstm.setString(1, eds.getEncryptedData());
			    pstm.setBytes(2, eds.getSecretKey());
			    pstm.setString(3, username);
				i=pstm.executeUpdate();
			    if(i==1){
			    	Mail k = new Mail();
					String sub = "Your change password for megilo success";
					String msgcontent = "Your password have been changed successfully!";
					k.sendMail(emailid, sub, msgcontent);
			    	return SUCCESS;
			    }
			}
			else
			{
				addActionError("error at change password");
				return ERROR;
			}	
		}
			d.closeConnection();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return ERROR;
	}

	public void prepare() throws Exception
	{
		sb = new ChangePassBean();

	}

	public ChangePassBean getModel()
	{

		return sb;
	}
	
	public void setSession(Map<String, Object> session)
	{
		sessionMap = (SessionMap<String, Object>) session;
	}

}