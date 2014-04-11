package com.action;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Random;
import javax.servlet.http.HttpSession;

import com.EncryptionDecryption;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import freemarker.template.utility.Execute;

import org.apache.struts2.ServletActionContext;

public class ForgotPass extends ActionSupport implements
		ModelDriven<ForgotPassBean>, Preparable
{

	ForgotPassBean sb;

	public String execute()
	{
		Boolean found = false;
		try
		{
			DAO d = DAO.getInstance();
			PreparedStatement pst = d.getPstm("select password,key from register where email=?");
			pst.setString(1, sb.getEmailId());
			ResultSet rs = pst.executeQuery();
			found = rs.next();
			if (found == true)
			{
				String pass = rs.getString(1);
				Blob blob = rs.getBlob(2);
				
				EncryptionDecryption ed = new EncryptionDecryption(pass, blob);
				pass = ed.getDecryptedData();
				
				Mail k = new Mail();
				String sub = "your password for megilo";
				String msgcontent = "your password is" + "  " + pass;
				k.sendMail(sb.getEmailId(), sub, msgcontent);
				return SUCCESS;
			}
			else
			{
				addActionError("error in forgot password!");
				return ERROR;
			}

		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public void prepare() throws Exception
	{
		sb = new ForgotPassBean();

	}

	public ForgotPassBean getModel()
	{

		return sb;
	}

}
