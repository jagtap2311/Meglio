/*$(document).ready(function () {  

 var validator = jQuery("#edit").validate({
    	    onfocusout: false,
    	    onkeyup: true,
    	    onclick: true,
    	    focusInvalid: true,
    	    rules: {
                fname: "required",
		lname: "required",
		mob:{
			required:true,
			minlength:10,	
			number: true
		},
                email: {
                    required: true,
                    email: true
                },
              city:"required",
               
            },
            messages: {
                fname: " *Please enter  first-name",
		lname: " *Please enter  last-name",
                mob: {
                required:	" *Please enter mobile no.",
                minlength: " *mobile no. at least 10 number"},

                email: " *Please enter a valid email-id",
                city:  " *Please enter city"
            },
    	          /*   errorPlacement: function(error,element){

    	                    error.insertAfter(element);
    	                    alert(error.html());
    	               },
    	               */
    	          /* showErrors: function(errorMap, errorList){
    	                      this.defaultShowErrors();
    	               }
    	});
});*/

(function($,W,D)
{
    var JQUERY4U = {};

    JQUERY4U.UTIL =
    {
        setupFormValidation: function()
        {
            //form validation rules
            $("#messagecmnt").validate({
            	rules: {
            		
            		msg: {
            			required: true,
                        minlength:10,
                        maxlength:200,
                    },
            		title: {
                        required: true,
                         minlength:5,
                         maxlength:20,
                    },
    		
    		EmailId: {
                        required: true,
                        email: true
                    },
                 
                   
                },
                messages: {
                	EmailId: { 
                		required:" *Please enter  E-mail Id",
                		email: "*Please enter valid email id"
                			 },
                			title: { 
                         		required:" *Please enter  Title",
                         		minlength: "*Contains atleast 5 character",
                         		maxlength: "*Contains atmost 20 character"
                         			 },
                         			msg: { 
                                 		required:" *Please enter  Message",
                                 		minlength: "*Contains atleast 10 character",
                                 		maxlength: "*Contains atmost 200 character"
                                 			 }
                	
                },
            	
                submitHandler: function(form) {
                    form.submit();
                }
            });
        }
    }

    //when the dom has loaded setup form validation rules
    $(D).ready(function($) {
        JQUERY4U.UTIL.setupFormValidation();
    });

})(jQuery, window, document);
