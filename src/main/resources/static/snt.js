 $(".edit").click(function () {
        $("#uid").val($(this).closest("tr").find('.uid').text());
        $("#uname").val($(this).closest("tr").find(".uname").text());
        $("#cprice1").val($(this).closest("tr").find(".cprice1").text());
        $("#cprice2").val($(this).closest("tr").find(".cprice2").text());
        $("#cprice3").val($(this).closest("tr").find(".cprice3").text());
        $("#cprice4").val($(this).closest("tr").find(".cprice4").text());
        $("#uadr").val($(this).closest("tr").find(".uadr").text());
        $("#uadd").val($(this).closest("tr").find(".uadd").text());
        $("#uadl").val($(this).closest("tr").find(".uadl").text());
        $("#uada").val($(this).closest("tr").find(".uada").text());
        $("#ureciever").val($(this).closest("tr").find(".ureciever").text());
        $("#uinn").val($(this).closest("tr").find(".uinn").text());
        $("#ukpp").val($(this).closest("tr").find(".ukpp").text());
        $("#uoktmo").val($(this).closest("tr").find(".uoktmo").text());
        $("#uaccname").val($(this).closest("tr").find(".uaccname").text());
        $("#uacnum").val($(this).closest("tr").find(".uacnum").text());
        $("#ubn").val($(this).closest("tr").find(".ubn").text());
        $("#ubik").val($(this).closest("tr").find(".ubik").text());
        $("#ukc").val($(this).closest("tr").find(".ukc").text());
        $("#ureq").val($(this).closest("tr").find(".ureq").text());
        $("#ucon").val($(this).closest("tr").find(".ucon").text());
    });