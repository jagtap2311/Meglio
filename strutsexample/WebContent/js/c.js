/* validation for delete*/
 (function($,W,D)
{
    var JQUERY4U = {};

    JQUERY4U.UTIL =
    {
        setupFormValidation: function()
        {
            
            $("#delete").validate({
            	 rules: {
                     
                     password: {
                     	required: true,
                     	minlength:5},
                     
                 },
                 messages: {
                    
                     password: {
                     required:	" *Please enter password",
                     minlength: " *password at least 5 chars"},
                     
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
