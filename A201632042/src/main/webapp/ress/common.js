$(function() {

	$("[data-url]").click(function() {
		var url = $(this).attr("data-url");
		location.href = url;
	})
	$("[data-confirm-delete]").click(function() {     return confirm("삭제하시겠");   }) 




})

function list() {
	var url = "list2?departmentId="+$('#st').val();
	location.href = url;
}
