/**
 * Author: Jacob Wong
 * Date: 2019/12/20
 */

$(function() {
	$('#username').on('blur', validateUsername);
	$('#password').on('blur', validatePassword);
	$('#confirm').on('blur', validateRegister);
  
  // do not submit the form if it doesn't pass the validation
  $('#registerForm').on('submit', function(e) {
  	if (!validateRegister())
      e.preventDefault();
  });

});

/* Form validation */
function validateRegister() {
	if ($('#confirm').val() === $('#password').val()) {
		verifyOk($('#confirmHint'));
	} else {
		return verifyFail($('#confirmHint'), 'Two passwords differ');
	}

	return validateUsername() && validatePassword();
}

/* Tell if a user name has already existed */
function validateUsername() {
	$.getJSON('data/users/' + $('#username').val())
	.done( function(data) {
		if (data)
			return verifyFail($('#usernameHint'), 'has been taken');
		else
			return verifyOk($('#usernameHint'));
	})
	.fail( function() {
		alert('fail to check user existance');
	})
	.always( function() {
		
	});
}

function validatePassword() {
	if ($('#password').val().length > 5)
		return verifyOk($('#passwordHint'));
	else
		return verifyFail($('#passwordHint'), 'Six characters at least');
}

function verifyOk(hintElement) {
	if (hintElement.is('.verify-fail'))
		hintElement.toggleClass('verify-ok verify-fail');
	hintElement.text = 'OK';
	return true;
}

function verifyFail(hintElement, hintText) {
	if (hintElement.is('.verify-ok'))
		hintElement.toggleClass('verify-ok verify-fail');
	hintElement.text = hintText;
	return false;
}
