package com.action;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class ConfirmRegister extends ActionSupport implements Preparable,ModelDriven<ConfirmBean>
{

	
	private static final long serialVersionUID = 1L;
	private ConfirmBean cb;
	private boolean found=false;
	
	public String execute() throws Exception
	{
		String id;
		try
		{
			DAO d = DAO.getInstance();
			ResultSet rs;
			PreparedStatement pst = d.getPstm("select * from register where id=? ");
			pst.setString(1, cb.getData());
			rs=pst.executeQuery();
			rs.next();
			id=rs.getString(1);			
			if(id!=null && id.length()>0)
			{				
				PreparedStatement pstm = d.getPstm("update register SET status='true' where id='"+cb.getData()+"'");
				pstm.executeUpdate();
				found=true;
			}
				
			d.closeConnection();
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		if(found==true)
			return SUCCESS;
		else
			return ERROR;
	}


	public ConfirmBean getModel()
	{
		
		return cb;
	}

	
	public void prepare() throws Exception
	{
		cb=new ConfirmBean();
		
	}

}