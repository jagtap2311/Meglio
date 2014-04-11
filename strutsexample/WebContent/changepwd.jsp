<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/a.css" />
<link rel="shortcut icon"     href="images//aa.png"    type="image/x-icon" />
<script type='text/javascript' src="js/jquery-1.8.3.js"></script>
<script type='text/javascript' src="js/jquery-ui.js"></script>
<script type='text/javascript' src="js/b.js"></script>
<script type='text/javascript' src="js/a.js"></script>
<script type='text/javascript' src="js/jquery.validate.min.js"></script>
<title>Meglio- Change Password</title>
</head>
<%@ include file="mainmenu.jsp" %>
<br><br><br><br><br><br>
<body class="cpbody">

<s:div cssClass="changepwddiv"> 

<s:form action="changepassword" method="post" theme="simple" id="changepwd">

						<s:password name="cp1" id="cp1" placeholder=" Old Password"
							cssClass="textbox" ></s:password>
						<s:password name="cp2" id="cp2" placeholder=" New Password"
							cssClass="textbox"></s:password>
						<s:password name="cp3" id="cp3" placeholder=" Retype Password"
							cssClass="textbox"></s:password>
						
							
						<s:submit cssClass="button lgt" value="Change"></s:submit>
<s:reset cssClass="button rst" value="Cancel"></s:reset>
					</s:form>	



</s:div>
</body>
</html>