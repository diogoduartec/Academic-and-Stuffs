var x = prompt("input a even number");
 try{
 	if(x%2!=0){
 		throw "odd number";
 	}
 	alert(x);
 }catch(e){
 	alert(e);
 }
