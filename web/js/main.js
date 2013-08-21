//$(document).on('submit', 'form[data-pjax]', function(event) {
//    $.pjax.submit(event, '.main-content');
//});
//
////$(document).ready(function() {
////   $('body').addClass('animated flip');
////});

var realPath = window.location.href;
var dashboard = "http://localhost:8080/LoginApplication/dashboard.jsp";

if (realPath === dashboard) {
    $('.logout').show();
}