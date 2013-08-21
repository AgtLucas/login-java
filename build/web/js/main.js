//$(document).on('submit', 'form[data-pjax]', function(event) {
//    $.pjax.submit(event, '.main-dashboard');
//});

var realPath = window.location.href;
var dashboard = "http://localhost:8080/LoginApplication/dashboard.jsp";

if (realPath === dashboard) {
    $('.logout').show();
}

$('.login-form').submit(function() {
    $('.login-input').each(function() {
        if ($(this).val().length === 0) {
            $(this).prev().append().html('Campo obrigatório!');
            event.preventDefault();
        }
    });
});