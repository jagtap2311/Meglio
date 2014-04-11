<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/a.css" />
<link rel="shortcut icon"     href="images//aa.png"    type="image/x-icon" />
<script type='text/javascript' src="js/a.js"></script>
<script type='text/javascript' src="js/jquery-1.8.3.js"></script>
<script type='text/javascript' src="js/jquery-ui.js"></script>
<script type='text/javascript' src="js/jquery.validate.min.js"></script>
<script type='text/javascript' src="js/e.js"></script>
<script type='text/javascript' src="js/a.js"></script>
<title>Meglio</title>
</head>
<div id="hometransdiv" class="closemsgdiv"></div>
<%@ include file="mainmenu.jsp" %>

<body id="homebody">
<s:if test="#session.status">
<input type="button" id="voicecomment"  class="button" value="Comment" name="comment"/>
<input type="button" id="message"  class="button side" value="Message" name="message"/>
<br/><br/><hr/>
<div id="homemsg">
<br/>
<table border="2" id="showmsg" width="100%">
<tr><td width="10%"><img src="images/a.jpeg" height="77px" width="93px"></img></td><td><table border="0"><tr><td>Name</td><td>:&nbsp;Rohit Kumar Noulakha</td></tr><tr><td>Title</td><td>:&nbsp;Cloud Computing</td></tr><tr><td>Date</td><td>:&nbsp;26/03/2014</td></tr></table></td></tr>
<tr><td colspan="2">Message</td></tr>
</table>
<br/>
</div> 

<div id="detail">
<table border="2" id="showmsg" width="100%">
<tr><td width="10%"><img src="images/a.jpeg" height="102px" width="93px"></img></td><td>
<table border="0">
<tr><td>Name</td><td>:&nbsp;Abhishek Jagpat</td>
</tr><tr><td>Mobile</td><td>:&nbsp;1234567809</td></tr>
<tr><td>Email-Id</td><td>:&nbsp;jagtap2311@gmail.com</td></tr>
<tr><td>City</td><td>:&nbsp;Indore</td></tr>
</table></td></tr>
</table>
</div>

<div id="messagebox">
<br>
<s:form action="" method="" id="messagecmnt" theme="simple">

<span class="label1">&nbsp;Message</span><div id="close"><img class="closemsgdiv" src="images/cl.png" height="25px"
					width="25px"></img></div>
<hr/>
			<s:textfield name="EmailId" placeholder=" Email-Id" cssClass="textbox widthlarge"></s:textfield>
			<s:textfield name="title" placeholder=" Title" cssClass="textbox widthlarge"></s:textfield>
			<s:textarea rows="16" cols="42" name="msg" placeholder=" Your Message here !" cssClass="textarea"></s:textarea>
			<br>
			<s:submit name="login" value="Message" cssClass="button lalign "></s:submit>
			<s:reset name="reset" label="Reset" cssClass="button lalign1 "
				value="Cancel"></s:reset>
		</s:form>
		</s:if>
		<s:else>
		<c:redirect url="index"></c:redirect>
		</s:else>
</div>










</body>
</html>