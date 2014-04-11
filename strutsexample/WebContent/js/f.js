
(function($,W,D)
{
    var JQUERY4U = {};

    JQUERY4U.UTIL =
    {
        setupFormValidation: function()
        {
           
            $("#form1").validate({
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
            	
                submitHandler: function(form) {
                    form.submit();
                }
            });
        }
    };
    $(D).ready(function($) {
        JQUERY4U.UTIL.setupFormValidation();
    });

})(jQuery, window, document);
