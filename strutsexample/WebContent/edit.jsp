<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="c" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/a.css" />
<link rel="shortcut icon"     href="images//aa.png"    type="image/x-icon" />
<script type='text/javascript' src="js/jquery-1.8.3.js"></script>
<script type='text/javascript' src="js/jquery-ui.js"></script>
<script type='text/javascript' src="js/a.js"></script>
<script type='text/javascript' src="js/d.js"></script>
<script type='text/javascript' src="js/jquery.validate.min.js"></script>
<title>Meglio- Edit Profile</title>
</head>
<%@ include file="mainmenu.jsp" %>
<br><br><br><br><br><br>
<body class="cpbody">
<s:div cssClass="changepwddiv"> 

<s:form action="editpro" method="" theme="simple" id="edit">

						
						<s:textfield name="fname" placeholder=" First Name"
							cssClass="textbox"></s:textfield>
							<s:textfield name="lname" placeholder=" Last Name"
							cssClass="textbox"></s:textfield>
							<s:textfield name="mob" placeholder=" Mobile"
							cssClass="textbox" maxlength="10"></s:textfield>
							<s:textfield name="city" placeholder=" City"
							cssClass="textbox"></s:textfield>
							<s:file name="pic" placeholder=" ProPic"
							cssClass="textbox"></s:file>
						
							
						<s:submit cssClass="button lgt" value="Save"></s:submit>
<s:reset cssClass="button rst" value="Cancel"></s:reset>
					</s:form>	
</s:div>
</body>
</html>