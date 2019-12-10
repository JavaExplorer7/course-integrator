/**
 * Author: Jacob Wong
 * Date: 2019/12/10
 */

$(function() {
	
});


/* Load new content into page */
function loadContent(url) {
  $('#content').load(url + ' #container').hide().fadeIn('slow');
}
