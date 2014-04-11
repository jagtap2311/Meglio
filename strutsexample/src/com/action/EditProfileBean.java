package com.action;

import java.sql.Blob;

public class EditProfileBean
{
	private String fname;
	private String lname;
	private String mob;
	private String city;
	private Blob pic;
	public String getFname()
	{
		return fname;
	}
	public void setFname(String fname)
	{
		this.fname = fname;
	}
	public String getLname()
	{
		return lname;
	}
	public void setLname(String lname)
	{
		this.lname = lname;
	}
	public String getMob()
	{
		return mob;
	}
	public void setMob(String mob)
	{
		this.mob = mob;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public Blob getPic()
	{
		return pic;
	}
	public void setPic(Blob pic)
	{
		this.pic = pic;
	}
	

}
