 $(document).ready(
        function() {
$('#btn1').click(function(){
	$.getJSON("DisplayRoomJSON",{rtype:$('#roomtype').val(),ajax:true},
	function(data){
		var htm="<html>";
		 htm+="<table >";
		 htm+="<tr><th>Room No&nbsp;&nbsp;&nbsp;</th><th>Room Type&nbsp;&nbsp;&nbsp;</th><th>Price</th></tr>";
		$.each(data,function(i,item){
	    htm+="<tr><td>"+item.roomno+"</td><td>"+item.roomtype+"</td><td>"+item.price+'</td></tr>';
		
		});
		htm+='</table></html>';
		
		$('#result1').html(htm);
	});
});

$('#btn').click(function(){
	$.getJSON("AvailibilityOfRoomJSON",{rtype:$('#roomtype').val(),ajax:true},
	function(data){
		var htm="<html>";
		 htm+="<table >";
		 htm+="<tr><th>Room No&nbsp;&nbsp;&nbsp;</th><th>Room Type&nbsp;&nbsp;&nbsp;</th><th>Price</th></tr>";
		$.each(data,function(i,item){
	    htm+="<tr><td>"+item.roomno+"</td><td>"+item.roomtype+"</td><td>"+item.price+'</td></tr>';
		
		});
		htm+='</table></html>';
		
		$('#result').html(htm);
	});
});

});