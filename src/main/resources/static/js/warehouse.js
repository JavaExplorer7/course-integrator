/**
 * Author: Jacob Wong
 * Date: 2019/12/7
 */

$(function() {
	// animate the searching results
	$('tr th').hide().fadeIn(2000);
	
	$('tbody tr').hide().each(function(index) {
		$(this).delay(100 * index).slideDown();
	});
	
	// check out the form before submitting
	$('#form').on('submit', function(e) {
		var searchBy = $('input[name="searchBy"]:radio').filter(":checked");
		var name 		 = $('input[name="courseName"]');
		var button 	 = $('input[type="image"]');
			
		if (searchBy.length < 1) {
			e.preventDefault();
			button.after('<br /><span>Check one of them, would you?</span>');
		} else if (searchBy.val() == 'name' && name.val().length < 1) {
				e.preventDefault();
				button.after('<br /><span>Are you forgetting something?</span>');
		}
	});

});