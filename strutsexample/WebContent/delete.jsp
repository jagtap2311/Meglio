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
<script type='text/javascript' src="js/c.js"></script>
<script type='text/javascript' src="js/a.js"></script>
<script type='text/javascript' src="js/jquery.validate.min.js"></script>
<title>Meglio- Delete</title>
</head>
<%@ include file="mainmenu.jsp" %>
<br><br><br><br><br><br>
<body class="cpbody">
<s:div cssClass="changepwddiv"> 

<s:form action="deleteac" method="" theme="simple" id="delete">

						
						<s:password name="password" placeholder=" Password"
							cssClass="textbox"></s:password>
						
							
						<s:submit cssClass="button lgt" value="Delete"></s:submit>
<s:reset cssClass="button rst" value="Cancel"></s:reset>
					</s:form>	



</s:div>
</body>
</html>