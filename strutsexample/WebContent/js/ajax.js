$(document).ready(function() {
	$('#unamesignup').blur(function(){
		var user=$('#unamesignup').val();
		$.ajax(
		{
			url: 'test',
			type: 'post',
			dataType: 'text',
			data: {username: user},
			success: function(response) 
			{
				alert(response);
			},
			error: function(response) 
			{
				alert(response);
			}
		});
	});
});