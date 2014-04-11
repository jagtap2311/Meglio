/*$(document).ready(function () {  



      
      var validator = jQuery("#changepwd").validate({
    	    onfocusout: false,
    	    onkeyup: true,
    	    onclick: true,
    	    focusInvalid: true,
    	    rules: {
               
                cp1: {
                	required: true,
                	minlength:5},
                cp2: {
                    	required: true,
                    	minlength:5},
                cp3: {
                        	required: true,
                        	minlength:5,
                        	equalTo:"#cp2",
                     },
            },
            messages: {
               
                cp1: {
                required:	" *Please enter password",
                minlength: " *password at least 5 chars"},
                cp2: {
                    required: "*Please enter password",
                    minlength: "*Password at least 5 chars",
                },

                cp3:{
                	required: "*Please enter password",
                    minlength: "*Password at least 5 chars", 
                	equalTo: "*Password fields have to match"
                },
            },
    	              /* errorPlacement: function(error,element){
    	                    error.insertAfter(element);
    	                    alert(error.html());
    	               },
    	               */
    	          /* showErrors: function(errorMap, errorList){
    	                      this.defaultShowErrors();
    	               }
    	});
      
});
   */
/*validation for change-pwd*/
(function($,W,D)
{
    var JQUERY4U = {};

    JQUERY4U.UTIL =
    {
        setupFormValidation: function()
        {
            //form validation rules
            $("#changepwd").validate({
            	 rules: {
                     
                     cp1: {
                     	required: true,
                     	minlength:5},
                     cp2: {
                         	required: true,
                         	minlength:5},
                     cp3: {
                             	required: true,
                             	minlength:5,
                             	equalTo:"#cp2",
                          },
                 },
                 messages: {
                    
                     cp1: {
                     required:	" *Please enter password",
                     minlength: " *password at least 5 chars"},
                     cp2: {
                         required: "*Please enter password",
                         minlength: "*Password at least 5 chars",
                     },

                     cp3:{
                     	required: "*Please enter password",
                         minlength: "*Password at least 5 chars", 
                     	equalTo: "*Password fields have to match"
                     },
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
