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
<script type='text/javascript' src="js/d.js"></script>
<script type='text/javascript' src="js/a.js"></script>
<script type='text/javascript' src="js/jquery.validate.min.js"></script>
<title>Meglio</title>
</head>
<body id="menubody">
<div id="mainmenu">
<ul>


<li>|&nbsp;&nbsp;<s:a href="myprofile.jsp">My Profile</s:a>&nbsp;&nbsp;|</li>
<li><s:a href="changepwd.jsp">Change Password</s:a>&nbsp;&nbsp;|</li>
<li><s:a href="edit.jsp">Edit</s:a>&nbsp;&nbsp;|</li>
<li><s:a href="delete.jsp">Delete</s:a>&nbsp;&nbsp;|</li>
<li><s:a href="logout">Logout</s:a>&nbsp;&nbsp;|</li>
</ul>

</div>
</body>
</html>