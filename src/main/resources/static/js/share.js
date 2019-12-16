/**
 * Author: Jacob Wong
 * Date: 2019/12/10
 */

$(function() {
  
  // do the fast load among about, contact and welcome tabs
  $('nav a').on('click', function(e) {
    var href = this.href;
    var page = href.substring(href.lastIndexOf("/") + 1);

    if (page !== 'home' && page !== 'warehouse') {
      e.preventDefault();
      
      $('nav a.current').removeClass('current');
      $(this).addClass('current');
      
      $('#container').remove();
      $('#content').load(href + ' #container').hide().fadeIn('slow');
    }
  });

});
