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
            $("#edit").validate({
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
