/**
 * Author: Jacob Wong
 * Date: 2019/12/20
 */

/* User name validity check involve ajax which can not
 * be used with other regular local checks */
var isUsernameValid = false;

$(function() {
	$('#username').on('blur', verifyUsername);
	$('#password').on('blur', verifyPassword);
	$('#confirm').on('blur', verifyConfirm);
  
  // do not submit the form if it doesn't pass the validation
  $('#registerForm').on('submit', function(e) {
  	if (!(isUsernameValid && verifyPassword() && verifyConfirm())) {
    	e.preventDefault();
      alert('Some Fields are Invalid');
  	}
  });

});

/*  */
function verifyConfirm() {
	var $confirm = $('#confirm').val();
	var $hint = $('#confirmHint');
	
	if ($confirm.length < 8) {
		verifyFail($hint, '8 characters long at least');
		return false;
	} else if ($confirm !== $('#password').val()) {
		verifyFail($hint, 'Two passwords differ');
		return false;
	} else {
		verifyOk($hint);
		return true;
	}
}

/* Tell if a user name has already existed */
function verifyUsername() {
	var $user = $('#username').val();
	var $hint = $('#usernameHint');
	
	if ($user.length < 5) {
		verifyFail($hint, '5 characters long at least');
	}
	
	$.getJSON('data/users/' + $user)
	.done( function(data) {
		if (data) {
			verifyFail($hint, 'has been taken');
		} else {
			verifyOk($hint);
			// user name valid only when this
			// statement is executed
			isUsernameValid = true;
		}
	})
	.fail( function() {
		//alert('fail to check user existance');
	})
	.always( function() {

	});
}

function verifyPassword() {
	var $pass = $('#password').val();
	var $hint = $('#passwordHint');

	if ($pass.length < 8) {
		verifyFail($hint, '8 characters long at least');
		return false;
	} else {
		verifyOk($hint);
		return true;
	}
}

function verifyOk(hintElement) {
	if (hintElement.is('.verify-fail'))
		hintElement.toggleClass('verify-ok verify-fail');
	hintElement.text('OK');
}

function verifyFail(hintElement, hintText) {
	if (hintElement.is('.verify-ok'))
		hintElement.toggleClass('verify-ok verify-fail');
	hintElement.text(hintText);
}
