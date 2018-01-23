function is_allow(age) {
	if(age>18)
		alert("allow");
	else alert("not allow");
}

function getLevel(score){
	if(score<10)
		return "not good";
	else if(score>=10 &&score>20)
		return "good";
	else return "amazing"
}

function getGener(gen){
	switch(gen){
		case "M":
			alert("Man");
			break;
		case "W":
			alert("Womman");
			break;
		default:
			alert("Other");
	}
}
