$(document).ready(function(){
    $('.pangTable').click(function(){
        $('.pangHtmlTable').load("../templates/pangData/pangTable.html");
        $('.pangTable').hide();
    })
    $('.pangHtmlTable').dblclick(function(){
        window.location.reload();
    })

        $("#keyword").keyup(function() {
            var k = $(this).val();
            $(".type08 > tbody > tr").hide();

            var temp = $(".type08 > tbody > tr > th:contains('" + k + "')");

            $(temp).parent().show();
        })
});