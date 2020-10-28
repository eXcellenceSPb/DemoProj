 $(".edit").click(function () {
        $("#uid").val($(this).closest("tr").find('.uid').text());
        $("#uname").val($(this).closest("tr").find(".uname").text());
        $("#ufam").val($(this).closest("tr").find(".ufam").text());
        $("#uphone").val($(this).closest("tr").find(".uphone").text());
        $("#upass").val($(this).closest("tr").find(".upass").text());
        $("#umail").val($(this).closest("tr").find(".umail").text());
        $("#urole").val($(this).closest("tr").find(".urole").text());
        $("#ugroup").val($(this).closest("tr").find(".ugroup").text());
    });