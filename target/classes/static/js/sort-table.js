/**
 * Author: Jacob Wong
 * Date: 2019/12/16
 */

var comparator = {
	date: function(a, b) {
	  return (new Date(a)) - (new Date(b));
	},
	number: function(a, b) {
		return a - b;
	},
  name: function(a, b) {
    a = a.replace(/^the /i, '');					// Remove 'The' from start of string
    b = b.replace(/^the /i, '');					// and sorting is case insensitive
    return (a < b)? -1 : ((a > b)? 1 : 0);
  },
  duration: function(a, b) {
    a = a.split(':');											// (MM:SS)
    b = b.split(':');											// Split the time at the colon
    
    a = Number(a[0]) * 60 + Number(a[1]);	// Convert the time to seconds
    b = Number(b[0]) * 60 + Number(b[1]);
    return a - b;
  }
};

$('.data-table').each(function() {
  var $table = $(this);                     // This data table
  var $tbody = $table.find('tbody');        // Store table body
  var $controls = $table.find('th');        // Store table headers

  $controls.on('click', function() {        // When user clicks on a header
  	var rows = $tbody.find('tr').toArray(); // Store current rows
    var $header = $(this);                  // Get the header
    var order = $header.data('sort');       // Get value of data-sort attribute
    var column;                             // Declare variable called column

    // If selected item has sorting-asc or sorting-desc class, reverse contents
    if ($header.is('.sorting-asc') || $header.is('.sorting-desc')) {  
      $header.toggleClass('sorting-asc sorting-desc');  // Toggle to other class
      $tbody.append(rows.reverse());                // Reverse the array
    } else {                                        // Otherwise perform a sort                            
      $header.addClass('sorting-asc');              // Add class to header
      // Remove asc or desc from all other headers
      $header.siblings().removeClass('sorting-asc sorting-desc');
      if (comparator.hasOwnProperty(order)) {  		// If compare object has method
        column = $controls.index(this);         	// Search for column index no

        rows.sort(function(a, b) {               // Call sort() on rows array
          a = $(a).find('td').eq(column).text(); // Get text of column in row a
          b = $(b).find('td').eq(column).text(); // Get text of column in row b
          return comparator[order](a, b);        // Call compare method
        });

        $tbody.append(rows);
      }
    }
  });
});
