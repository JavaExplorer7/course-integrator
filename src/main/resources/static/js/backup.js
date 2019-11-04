

$(function() {
  // set up table sorting
  var $table = $('.data-table').stupidtable();
  $('thead th:first-child', $table).click();

  $table.on('beforetablesort', function (event, data) {
    // move blanks to bottom
    $(this).stupidTableBlanks(data);
  });

  $table.on('aftertablesort', function (event, data) {
    if (usingLazyLoadFallback)
      lazyLoadImages();
  });
});