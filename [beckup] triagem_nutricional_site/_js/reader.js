var userList = document.getElementById('userList');
var test = document.getElementById('testing');
var patientList = [];
var icons = [];
//test.innerHTML = email.value;
var emailValue = localStorage.getItem("emailText");
emailValue = emailValue.replace(".","_");

firebase.database().ref('nutricionists/'+emailValue+'/patients').on('value', function(snapshot){
	userList.innerHTML = '';
	snapshot.forEach(function(item){
		var patient = {
			name: item.val().name,
			age: item.val().age
		};
		patientList.push(patient);
		var row = document.createElement('DIV');
		var col_10 = document.createElement('DIV');
		var col_2 = document.createElement('DIV');
		var li = document.createElement('li');
		var img_download = document.createElement("IMG");
		var span = document.createElement("SPAN");
		var img_open_form = document.createElement("IMG");

		img_download.src = "_assets/icon-form.png";
		img_download.classList.add("icon-download");
		icons.push(img_download);

		//img_open_form.src = "_assets/icon-form";
		//img_open_form.classList.add("icon-open-form");

		span.appendChild(document.createTextNode("Abrir formulário"));
		span.classList.add("Tooltip");

		col_10.appendChild(document.createTextNode(item.val().name));
		col_2.appendChild(img_download);
		col_2.appendChild(span);

		col_2.classList.add("col-2");
		col_10.classList.add("col-10");
		
		row.appendChild(col_10);
		row.appendChild(col_2);
		row.classList.add("row");

		li.appendChild(row);
		li.classList.add("list-group-item");
		userList.appendChild(li);
	});
});

function vai(){
	if(icons.length > 0){
		icons[0].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[0].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 1){
		icons[1].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[1].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 2){
		icons[2].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[2].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 3){
		icons[3].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[3].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 4){
		icons[4].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[4].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 4){
		icons[4].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[4].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 5){
		icons[5].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[5].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 6){
		icons[6].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[6].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 7){
		icons[7].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[7].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 8){
		icons[8].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[8].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 9){
		icons[9].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[9].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 10){
		icons[10].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[10].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 11){
		icons[11].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[11].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 12){
		icons[12].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[12].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 13){
		icons[13].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[13].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 14){
		icons[14].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[14].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 15){
		icons[15].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[15].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 16){
		icons[16].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[16].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 17){
		icons[17].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[17].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 18){
		icons[18].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[18].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 19){
		icons[19].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[19].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 20){
		icons[20].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[20].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 21){
		icons[21].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[21].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 22){
		icons[22].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[22].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 23){
		icons[23].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[23].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 24){
		icons[24].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[24].name);
		window.location.href = "formulario.html";
	});}
	if(icons.length > 25){
		icons[25].addEventListener('click', function(){
		localStorage.setItem("patient", patientList[25].name);
		window.location.href = "formulario.html";
	});}
}

