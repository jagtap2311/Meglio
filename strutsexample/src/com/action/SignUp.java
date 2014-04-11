package com.action;
import java.sql.PreparedStatement;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import com.EncryptionDecryption;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;



public class SignUp extends ActionSupport implements ModelDriven<SignUpBean>, Preparable
{
	
	private static final long serialVersionUID = 1L;
	SignUpBean sb;

	public String execute() throws Exception
	{
		
		  
		String id=Math.random()+sb.getEmailId();
		String status="false";
		try
		{
			EncryptionDecryption ed = new EncryptionDecryption(sb.getPassword1());
			DAO d = DAO.getInstance();
			PreparedStatement pst = d.getPstm("insert into register values(?,?,?,?,?,?)");
			pst.setString(1, sb.getUname());
			pst.setString(2, ed.getEncryptedData());
			pst.setString(3, sb.getEmailId());
			pst.setString(4, id);
			pst.setString(5, status);
			pst.setObject(6, ed.getSecretKey());
			pst.executeUpdate();
			d.closeConnection();
			String sub="Please verify the link for register you in Meglio";
			String msgcontent="Dear Customer,\n Thanks for registering with us.\n Please click on given below confirmation link.\n http://localhost:8080/strutsexample/verifyregister?data="+id+" \nRegards,\nWebmaster\nMeglio\n";
			Mail k=new Mail();
			k.sendMail(sb.getEmailId(),sub,msgcontent);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return SUCCESS;
		

	}

	public void prepare() throws Exception
	{
		sb = new SignUpBean();

	}

	public SignUpBean getModel()
	{

		return sb;
	}
	
	
}


 
 
 