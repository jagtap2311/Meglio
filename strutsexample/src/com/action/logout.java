package com.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class logout extends ActionSupport implements SessionAware
{

	private static final long serialVersionUID = 1L;
	private SessionMap<String, Object> sessionMap;

	public String execute() throws Exception
	{
		if (sessionMap != null)
			sessionMap.invalidate();
		return SUCCESS;
	}

	public void setSession(Map<String, Object> session)
	{
		sessionMap = (SessionMap<String, Object>) session;
	}

}