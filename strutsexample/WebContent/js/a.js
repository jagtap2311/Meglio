$(document).ready(function () {    
  	

	
	
		
	  $("#sbtn").click(function () {
		
		  $("#btncon").css({height:'280px',width:'230px'});
		  $("#form1").slideDown(1200);
		  $("#sbtn").hide();
		  $("#sbtn1").hide();
		  
		  });
	  
	  
	  
	  
	  
	  
	  
	  
	  $("#message").click(function () {
			 
			
			 $(".closemsgdiv").show();
			 $("#messagebox").show();
			  });
		 
		  $(".closemsgdiv").click(function () {
				 
			  $("#messagebox").hide( "explode", 
	                     {pieces: 40 }, 1000 );
	
				 $(".closemsgdiv").hide();
				
				  });
		  
	  
		  
	  $("#sbtn1").click(function () {
		 
		  $(".closediv").show();
		  $("#signindiv").show();
		  $("#forgot").hide( "explode", 
                  {pieces: 40 }, 1000 );
		  $("#container").css({zindex: '-1',position:'static'});
		  
		  });
	  
	  $(".closediv").click(function () {
		  $(".closediv").hide();
		  $("#signindiv").hide( "explode", 
                  {pieces: 40 }, 1000 );
		  $("#forgot").hide( "explode", 
                  {pieces: 40 }, 1000 );
		  });
	  
	  
	  $("#frgt").click(function () {
		 
		  $(".closediv").show();
		  $("#signindiv").hide( "explode", 
                  {pieces: 40 }, 1000 );
		  $("#forgot").show();
		  });
	  $( ".changepwddiv" ).position({
		  my: "center",
		  at: "center",
		  of: ".cpbody"
		  });
	  

});		
/* ----------------------------------------------------------------------------------------------------------------  */

$(window).load(function() {

      $( "#aarw" ).position(
  		  	{
  		  		my: "center",
  		  		at: "center",
  		  		of: ".arw"
  		  	});
      $( "#bbrw" ).position(
    		  	{
    		  		my: "center",
    		  		at: "center",
    		  		of: ".brw"
    		  	});
     

/* ----------------------------------------------------------------------------------------------------------------  */
      
     
  
      
      
      
      
      
      
      
      
/*validation for form sign-up */
      
      var validator = jQuery("#form1").validate({
    	    onfocusout: false,
    	    onkeyup: true,
    	    onclick: true,
    	    focusInvalid: true,
    	    rules: {
                uname: "required",
                password1: {
                	required: true,
                	minlength:5},
                EmailId: {
                    required: true,
                    email: true
                },
              
                password2: {
              	  required: true,
                    minlength:5,
              	  equalTo: "#password1",
                    },
                check1: "required"
            },
            messages: {
                uname: " *Please enter your user-name",
                password1: {
                required:	" *Please enter password",
                minlength: " *password at least 5 chars"},
                password2: {
                    required: "*Please enter password",
                    minlength: "*Password at least 5 chars",
                    equalTo: "*Password fields have to match"
                },

                EmailId: " *Please enter a valid email-id",
                check1:  " *Please accept our policy"
            },
    	              /** errorPlacement: function(error,element){
    	                    error.insertAfter(element);
    	                    alert(error.html());
    	               },
    	               */
    	           showErrors: function(errorMap, errorList){
    	                      this.defaultShowErrors();
    	               }
    	});
        


      
        
    
 
  /*----------SignIn and Forgot---------------*/
      
      
      
      /*validation for Sign-In*/
      var validator = jQuery("#form2").validate({
    	    onfocusout: false,
    	    onkeyup: true,
    	    onclick: true,
    	    focusInvalid: true,

    	    rules: {
    	                      //replace with your fields
    	          uname: "required",
    	        password1:  {
                  	required: true,
                  	minlength:5},

    	    },
    	    messages: {
    	                      //replace with your error message
    	          uname: "*Please enter the user-name",
    	          password1: {
    	                required:	" *Please enter password",
    	                minlength: " *Password at least 5 chars"},    
    	       },
    	              /** errorPlacement: function(error,element){
    	                    error.insertAfter(element);
    	                    alert(error.html());
    	               },
    	               */
    	           showErrors: function(errorMap, errorList){
    	                      this.defaultShowErrors();
    	               }
    	});
      
      
      
 /*   validation for forgot password */
      var validator = jQuery("#form3").validate({
  	    onfocusout: false,
  	    onkeyup: true,
  	    onclick: true,
  	    focusInvalid: true,
  	    rules: {
  	                      //replace with your fields
  	    	EmailId: {
                required: true,
                email: true
            }
  	    },
  	    messages: {
  	                      //replace with your error message
  	          EmailId: "*Please enter valid the Email-Id"         
  	       },
  	              /** errorPlacement: function(error,element){
  	                    error.insertAfter(element);
  	                    alert(error.html());
  	               },
  	               */
  	        showErrors: function(errorMap, errorList){
  	                      this.defaultShowErrors();
  	               }
  	});
      
      

      
  
});