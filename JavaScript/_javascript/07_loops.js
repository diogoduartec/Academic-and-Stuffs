for(var i=0; i<5; i++){
	alert(i+" loop");
}

var numbers = new Array("Diogo", "Roberto", "Duarte", "da","Costa");
for(i in numbers){
	alert(numbers[i]);
}

do{
	var str = prompt("Do you like get out of this loop?");
}while(str=="no");
