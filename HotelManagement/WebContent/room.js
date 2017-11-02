$(document).ready(function(){
	
	$('#result').on("change","#ct",function(){
		var c=$('#ct').val();
		if(c=="singlebedroom")
			{
			$('#amt').val('200');
			}
		else if(c=="doublebedroom"){
			var a=200*2;
			$('#amt').val(a);
			
		}
		var x='';
		x+='<tr><td><b><i>Room Type:</i></b></td><td><select name=ct id=ct><option>-Select-</option><option value=\"singlebedroom\">Monthly</option><option value=\"doublebedroom\">Half Yearly</option></select></td></tr>';
		x+='<tr><td><b><i>Amount:</i></b></td><td><input type=text name=amt id=amt></td></tr>';
        x+='<tr><td><b><i>Issue Date:</i></b></td><td><input type=text name=isd id=isd></td></tr>';
        x+='<tr><td><b><i>Expiry Date:</i></b></td><td><input type=text name=expd id=expd></td></tr>';
        x+='<tr><td><input type=submit></td></tr>';
      $('#result').html(x);
		$('#result');
	});
});