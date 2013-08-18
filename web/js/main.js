$(document).on('submit', 'form[data-pjax]', function(event) {
    $.pjax.submit(event, alert('aaa'));
});

//$(document).ready(function() {
//   $('body').addClass('animated flip');
//});