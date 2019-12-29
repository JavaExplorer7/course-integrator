/**
 * Author: Jacob Wong
 * Date: 2019/12/7
 */

$(function() {
  // do a search when the page first loads
  processSearch();
  
  // inspect the form before performing the search
  $('#form').on('submit', function(e) {
    e.preventDefault();
    var $searchBy   = $('input[name="searchBy"]:radio').filter(":checked");
    var $name       = $('input[name="courseName"]');
    var $hint       = $('#hint');
    
    // clear the previous hint
    $hint.text('');
    if ($searchBy.length < 1) {
      $hint.text('Search by ??');
    } else if ($searchBy.val() == 'name' && $name.val().length < 1) {
      $hint.text('Name is empty !');
    } else {
      processSearch();
    }
  });

});

/* Animate the searching results */
function animateSearchResults() {
  $('tr th').hide().fadeIn(2000);
  $('tbody tr, tfoot tr').hide().each(function(index) {
    $(this).delay(100 * index).slideDown();
  });
}

/* Do a Ajax get search */
function processSearch() {
  $.ajax({
    type:      "GET",
    url:       "warehouse/search",
    data:      $('#form').serialize(),
    timeout:   2000,
  
    beforeSend: function() {
      
    },
    complete: function() {
      
    },
    fail: function() {
      alert('fail to fetch the course list');
    },
    success: function(data) {
      var newList = '';
      var newSummary = '';
      var summary = {
        size: 0,
        credits: 0,
        theories: 0,
        experiments: 0
      };
      
      $.each(data, function(key, val) {
        newList += '<tr>' 
        + '<td class="cell-name"><a class="ent-name" href="course/index?id=' + val.id + '" title="View details for ' + val.id + '">' + val.id + '</a></td>'
        + '<td class="cell-name">'       + val.title  + '</td>'
        + '<td class="cell-name-type">'  + val.type   + '</td>'
        + '<td class="cell-num">'        + val.credit + '</td>'
        + '<td class="cell-num">' + ((val.theory == 0)?     '-' : val.theory)      + '</td>'
        + '<td class="cell-num">' + ((val.experiment == 0)? '-' :  val.experiment) + '</td>'
        + '<td class="cell-num">' + ((val.semester == 0)?   '-'  :  val.semester)    + '</td>'
        + '</tr>';
        
        summary.size      += 1;
        summary.credits  += val.credit;
        summary.theories += val.theory;
        summary.experiments += val.experiment;
      });
      
      newSummary += '<tr>'
      + '<td class="cell-name">-</td>'
      + '<td class="cell-name">-</td>'
      + '<td class="cell-name-type">-</td>'
      + '<td class="cell-sum">' + summary.credits     + '</td>'
      + '<td class="cell-sum">' + summary.theories    + '</td>'
      + '<td class="cell-sum">' + summary.experiments + '</td>'
      + '<td class="cell-num">-</td>'
      + '</tr>';
      
      $('tbody tr').remove();
      $('tfoot tr').remove();
      $('tbody').html(newList);
      $('tfoot').html(newSummary);
      $('#hint').text((summary.size == 0)? 
        'Not Found' : (summary.size + ' course(s) found'));
      animateSearchResults();
    }
  });
}
