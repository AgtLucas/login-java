//$(document).on('submit', 'form[data-pjax]', function(event) {
//    $.pjax.submit(event, '.main-dashboard');
//});

var realPath = window.location.href;

$('.login-form').submit(function() {
    $('.login-input').each(function() {
        if ($(this).val().length === 0) {
            $(this).prev().append().html('Campo obrigatório!');
            event.preventDefault();
        }
    });
});
