$(document).ready(function(){
	$('#result1').on("change","#ct",function(){
		
		$('#isd').val(cd);
		var c=$('#ct').val();
		var exp=new Date();
		if(c=="singlebedroom"){
			$('#amt').val('200');
			exp.setMonth(exp.getMonth()+1);
		}
		else if(c=="doublebedroom"){
			var a=200*6;
			$('#amt').val(a);
			exp.setMonth(exp.getMonth()+6);
		}
		else if(c=="familysuiteroom"){
			var a=200*12;
			$('#amt').val(a);
			exp.setMonth(exp.getMonth()+12);
		}
		var e=exp.getFullYear()+'/'+(exp.getMonth()+1)+'/'+exp.getDate();
		$('#expd').val(e);
		
	});
	
});