<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" type="text/css" href="css/a.css" />
<link rel="shortcut icon"     href="images//aa.png"    type="image/x-icon" />
<script type='text/javascript' src="js/jquery.js"></script>
<script type='text/javascript' src="js/jquery-1.8.3.js"></script>
<script type='text/javascript' src="js/jquery-ui.js"></script>
<script type='text/javascript' src="js/a.js"></script>
<script type='text/javascript' src="js/ajax.js"></script>
<script type='text/javascript' src="js/jquery.validate.min.js"></script>
<title>Meglio</title>
</head>
<body>

	<div id="signindiv">
		<br> <span class="label1">&nbsp;SignIn</span><div id="close"><img class="closediv" src="images/cl.png" height="25px"
					width="25px"></img></div>
		<hr>
		<s:form action="signin" method="post" id="form2" theme="simple">
			<s:textfield name="uname" id="signinuname"  placeholder=" User Name" cssClass="textbox tcenter"></s:textfield>
			<s:password name="password1" id="signinpwd"  placeholder=" Password"
				cssClass="textbox tcenter"></s:password>
				<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;
				<s:checkbox name="check1"></s:checkbox><span class="label">Remember me !</span>
			<br>
			<s:submit name="login" id="#signinlogin" value="SignIn" cssClass="button login login1"></s:submit>
			<s:reset name="reset" label="Reset" cssClass="button reset reset2"
				value="Cancel"></s:reset>
		</s:form>
		<br>
		<br>
		<hr id="hrid">
			<label class="label">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<center><s:a href="">
					<span id="frgt">Forgot Password ?</span>
				</s:a></center></label>
	</div>


	<div id="forgot">
		<br> <span class="label1">&nbsp;Forgot Password</span>
		<div id="close"><img class="closediv" src="images/cl.png" height="25px"
					width="25px"></img></div>
		<hr>
		<s:form action="forgotpass" method="" id="form3" theme="simple">
			<s:textfield name="EmailId" placeholder=" Email-Id" cssClass="textbox tcenter"></s:textfield>
			<br>
			<s:submit name="login" value="Send" cssClass="button login login1"></s:submit>
			<s:reset name="reset" label="Reset" cssClass="button reset reset1"
				value="Cancel"></s:reset>
		</s:form>
		<br>
		<br>
		<hr id="hrid">
			
	</div>
	
	<div id="mainpage">
		<div id="mysignin" class="closediv"></div>
		
		
		
		
		
		
		
		<div id="slider">
		<div style="height: 205px; width: 750px;">
	    <img src="images/p3.gif"  class="sliderdiv1"  width="150px" height="150px"></img>
		<img src="images/p2.gif"  class="sliderdiv1"  width="150px" height="150px"></img>
		
		
		</div>
		<br>
		<div style="height: 205px; width: 750px;">
		<img src="images/p1.jpeg"  class="sliderdiv1"  width="150px" height="150px"></img>
		<img src="images/p5.jpeg"  class="sliderdiv1"  width="150px" height="150px"></img>
		</div>
		
		
		</div>
		
		
		
		
		
		
		
		
		

		<div id="menu">
		<div id="socialnet">
		<img src="images/f.png" id="fmenu"></img>
		<img src="images/g.png" id="gmenu"></img>
		<img src="images/l.png" id="lmenu"></img>
		<img src="images/t.png" id="tmenu"></img>
		</div>	
			<div id="container">
				<img src="images/aa.png" id="logo" width="150px" height="150px"></img><br>
			<span id="heading">&nbsp;Reach your voice!</span><br><br>

				
					<input type="button" value="SignUp" id="sbtn"
						class="button login dept"> <input type="button"
						value="SignIn" id="sbtn1" class="button login dept">

					<s:form action="signup" method="post" theme="simple" id="form1">

						<s:textfield name="uname" id="unamesignup"  placeholder=" User Name"
							cssClass="textbox"></s:textfield>
						<s:password name="password1" id="password1" placeholder=" Password"
						
							cssClass="textbox"></s:password>
						<s:password name="password2" id="password2" placeholder=" Retype Password"
							cssClass="textbox"></s:password>
						<s:textfield name="EmailId" placeholder=" Email-Id"
							cssClass="textbox"></s:textfield><br/>
							&nbsp;&nbsp;<s:checkbox name="check1"><span class="label">I Agree <a href="#terms" id="back">Terms & Conditions</a>&nbsp;!&nbsp;</span></s:checkbox>
						<s:submit name="login" value="Sign Up" cssClass="button lgt "></s:submit>
						<s:reset name="reset" label="Reset " cssClass="button rst"
							value="Cancel"></s:reset>&nbsp;&nbsp;&nbsp;<br/>
							<span class="label"><center><a href="index.jsp" id="back">Sign-In or Sign-Up</a></center></span>
					</s:form>	
					
			</div>				
		</div>


		<div class="arw">
		
				<a href="#moremenu"><img id="aarw" src="images/md.png" height="50px"
					width="50px"></img></a>
			
		</div>
		<br>
		<div id="moremenu">
		<div class="aboutus">	
		<div id="abtusimg"><img src="images/abt.png"  width="150px" height="150px"></img></div>
		<div id="abtustext">
		<span id="heading">About Us</span><br><br>
	<span class="mycontent">
		Since the beginning, we have focused on providing the best user
		 experience possible. Whether we are designing a new Internet browser
		  or a new tweak to the look of the homepage, we take great care to 
		  ensure that they will ultimately serve you, rather than our own internal
		   goal or bottom line.
		   Since the beginning, we have focused on providing the best user
		 experience possible. Whether we are designing a new Internet browser
		  or a new tweak to the look of the homepage, we take great care to 
		  ensure that they will ultimately serve you, rather than our own internal
		   goal or bottom line.
		</span>
		
		</div>
		</div>
	
	<hr/>
	
	
	
	
	<div class="aboutus">	
		
		<div id="cntustext">
		
		
		<span id="heading">Contact Us</span><br><br>
	<span class="mycontent">
		Since the beginning, we have focused on providing the best user
		 experience possible. Whether we are designing a new Internet browser
		  or a new tweak to the look of the homepage, we take great care to 
		  ensure that they will ultimately serve you, rather than our own internal
		   goal or bottom line.
		   Since the beginning, we have focused on providing the best user
		 experience possible. Whether we are designing a new Internet browser
		  or a new tweak to the look of the homepage, we take great care to 
		  ensure that they will ultimately serve you, rather than our own internal
		   goal or bottom line.
		</span>
		
		
		</div>
		<div id="cntusimg"><img src="images/cnt.png"  width="150px" height="150px"></img></div>
		</div>
	
	<hr/>
	
	
	
	<div class="aboutus" id="terms">	
		<div id="abtusimg"><img src="images/cont.jpeg"  width="150px" height="150px"></img></div>
		<div id="abtustext">
		
		<span id="heading">Terms & Conditions !</span><br><br>
	<span class="mycontent" id="terms">
		Many students unfortunately perceive their teachers as adversaries. 
		Voice comments allow you to reassure students you're on their team 
		by giving you control over the tone and nuance of your feedback.</span>
		
		</div>
		</div>
		
		
	<br>
		
		<div class="brw">

				<a href="#mainpage"><img  id="bbrw" src="images/mu.png" height="50px"
					width="50px"></img></a>
		
		</div>
		<br>
	</div>
</body>
</html>