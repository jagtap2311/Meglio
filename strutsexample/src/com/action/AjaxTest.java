//package com.action;
//
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//import javax.servlet.http.HttpServletResponse;
//
//import com.opensymphony.xwork2.ActionSupport;
//
//public class AjaxTest extends ActionSupport
//{
//private AjaxTestBean aj;	
//private String user;	
//HttpServletResponse response;
//@Override
//public String execute() throws Exception
//{
//	try{
//		DAO d = DAO.getInstance();
//		PreparedStatement ps=d.getPstm("select username from register where username=?");
//			user=aj.getUsername();
//			ps.setString(1, user);
//			ResultSet rs=ps.executeQuery();
//			if(rs.next()){
//				return ERROR;
//			}
//				else
//			{
//					return SUCCESS;
//			}
//		
//	}
//catch(Exception e)
//{
//	e.printStackTrace();
//}
//	return SUCCESS;	
//}
//
//public void prepare() throws Exception
//{
//	aj= new AjaxTestBean();
//}
//
//public AjaxTestBean getModel()
//{
//
//	return aj;
//}
//}