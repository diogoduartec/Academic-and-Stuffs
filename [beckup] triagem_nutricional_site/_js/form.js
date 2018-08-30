var emailValue = localStorage.getItem("emailText");
var patient = localStorage.getItem("patient");
emailValue = emailValue.replace(".","_");
var buttonDownload = document.getElementById("button-download");
var nome;

firebase.database().ref('nutricionists/'+emailValue+'/patients/'+patient).on('value', function(snapshot){
	var pesoAtual = snapshot.val().actualWeigth;
	var idade = snapshot.val().age;
	var clinica = snapshot.val().clinic;
	var coMorbidades = snapshot.val().coMorb;
	var riscoNutricional = snapshot.val().diseaseRisk;
	var altura = snapshot.val().heigth;
	var imc = snapshot.val().imc;
	var diagnosticoNutricional = snapshot.val().imcdiagnostic;
	var diagnosticoMedico = snapshot.val().medicalDiegnostic;
	nome  = snapshot.val().name;
	var estadoNutricional = snapshot.val().nutritionalState;
	var registro = snapshot.val().register;
	var leito = snapshot.val().room;
	var score = snapshot.val().score;
	var sexo = snapshot.val().sex;
	var pesoUsual = snapshot.val().usualWeigth;
	var imcNumber = Number(imc);
	var perdaDePeso = snapshot.val().lose_weight;
	var lessFood = snapshot.val().less_food;
	var uti = snapshot.val().uti;

	document.getElementById("nome").innerHTML += nome;
	document.getElementById("clinica").innerHTML += clinica;
	document.getElementById("leito").innerHTML += leito;
	document.getElementById("diagnostico-medico").innerHTML += diagnosticoMedico;
	document.getElementById("diagnostico-nutricional").innerHTML += diagnosticoNutricional;
	document.getElementById("co-morbidades").innerHTML += coMorbidades;
	document.getElementById("peso-atual").innerHTML += pesoAtual;
	document.getElementById("peso-usual").innerHTML += pesoUsual;
	document.getElementById("altura").innerHTML += altura;
	document.getElementById("imc").innerHTML += imcNumber.toFixed(2);
	document.getElementById("idade").innerHTML += idade;
	document.getElementById("sexo").innerHTML += sexo;
	document.getElementById("registro").innerHTML += registro;

	if(imcNumber < 20.5){
		document.getElementById("sim1").innerHTML += "<b>X</b>";
	}else{
		document.getElementById("nao1").innerHTML += "<b>X</b>";
	}					
	if(perdaDePeso == true){
		document.getElementById("sim2").innerHTML += "<b>X</b>";
	}else{
		document.getElementById("nao2").innerHTML += "<b>X</b>";
	}
	if(lessFood == true){
		document.getElementById("sim3").innerHTML += "<b>X</b>";
	}else{
		document.getElementById("nao3").innerHTML += "<b>X</b>";
	}
	if(uti == true){
		document.getElementById("sim4").innerHTML += "<b>X</b>";
	}else{
		document.getElementById("nao4").innerHTML += "<b>X</b>";
	}
	document.getElementById("score").innerHTML += "<b>"+score+".</b>";
});

/*var doc = new jsPDF();
	var specialElementHandlers = {
	    '#editor': function (element, renderer) {
	        return true;
	}
};

$('#btGerarPDF').click(function () {
	alert("TOPZEIRA");
    doc.fromHTML($('#conteudo').html(), 15, 15, {
        'width': 170,
            'elementHandlers': specialElementHandlers
    });
    doc.save('exemplo-pdf.pdf');
});*/
document.getElementById("button-download").addEventListener('click', getPDF);
function genPDF(){
	html2canvas(document.body, {
		onrendered: function (canvas){
			var img = canvas.toDataURL("image/png");
			var doc = new jsPDF();
			doc.addImage(img, 'JPEG', 20, 20);
			doc.save(nome+'.pdf');
		}
	})
}

var cache_width = $('#conteudo').width(); //Criado um cache do CSS
var a4  =[ 595.28,  841.89]; // Widht e Height de uma folha a4

function getPDF(){
        // Setar o width da div no formato a4
        $("#conteudo").width((a4[0]*1.33333) -80).css('max-width','none');

        // Aqui ele cria a imagem e cria o pdf
        html2canvas($('#conteudo'), {
          onrendered: function(canvas) {
            var img = canvas.toDataURL("image/png",1.0);  
            var doc = new jsPDF({unit:'px', format:'a4'});
            doc.addImage(img, 'JPEG', 20, 20);
            doc.save(nome+'.pdf');
            //Retorna ao CSS normal
            $('#conteudo').width(cache_width);
          }
        });
}
