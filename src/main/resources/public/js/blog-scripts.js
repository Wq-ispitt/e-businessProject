
$(function() {

    $('#messages li').click(function() {
        $(this).fadeOut();
    });

    setTimeout(function() {
        $('#messages li.info').fadeOut();
    }, 3000);
});
//intend to hide automatically all notification messages after 3 seconds, and hide all notification messages on mouse click
