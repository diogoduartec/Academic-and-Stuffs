var email = document.getElementById('emailInput');
var password = document.getElementById('passwordInput');
var button = document.getElementById('btnAuthentication');

button.addEventListener('click', validation);


function validation() {
	localStorage.setItem("emailText", email.value);
	firebase.auth().signInWithEmailAndPassword(email.value, password.value)
		.then(function(result){
			console.log(result);
			window.location.href = "home.html";
		})
		.catch(function(error){
			console.log(error.code);
			console.log(error.message);
			alert('Falha ao autenticar ' + email.value);
		});
}
