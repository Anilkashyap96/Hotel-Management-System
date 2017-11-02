
 $(document).ready(
function() {
$('#btn').click(function(){
	$.getJSON("Payment",{roomno:$('#rno').val(),ajax:true}
	/*function(data){
		var htm="<html>";
		 htm+="<table >";
		 htm+="<tr><th>Room No&nbsp;&nbsp;&nbsp;</th><th>Room Type&nbsp;&nbsp;&nbsp;</th><th>Price</th></tr>";
		$.each(data,function(i,item){
	    htm+="<tr><td>"+item.roomno+"</td><td>"+item.roomtype+"</td><td>"+item.price+'</td></tr>';
		
		});
		htm+='</table></html>';
		
		$('#result1').html(htm);
	}*/);
});
});