$(".edit").click(function () {
    $("#uid").val($(this).closest("tr").find('.uid').text());
    $("#uname").val($(this).closest("tr").find(".uname").text());
    $("#ustreet").val($(this).closest("tr").find(".ustreet").text());
    $("#uhouse").val($(this).closest("tr").find(".uhouse").text());
    $("#usurv").val($(this).closest("tr").find(".usurv").text());
    $("#udev").val($(this).closest("tr").find(".udev").text());
    $("#ukad").val($(this).closest("tr").find(".ukad").text());
    $("#upos").val($(this).closest("tr").find(".upos").text());
    $("#usquare").val($(this).closest("tr").find(".usquare").text());
    $("#ucont").val($(this).closest("tr").find(".ucont").text());
});