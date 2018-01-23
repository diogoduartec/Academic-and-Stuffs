// /*
// * Created by Diogo Duarte on 19/01/2018
// * Studying operators
// */
// /*Math operators*/
// var add = 5+6;
// var sub = 5454-9999;
// var mult = 6*2;
// var div = 6/5;
// var mod = 5%3;
// var uni = -1;
// var str = "web "+"- dev"; //concat
// //alert(str);

// /*Equality operators*/
// var op = 6;
// //alert(6=="6");
// //alert(6==="6");
// //alert(6!="6");
// //alert(6!=="6");
// //alert(6>5);
// //alert(6>=5);
// //alert(6<5);
// //alert(6<=5);

// /*Logical operators*/
// var op1 = true;
// var op2 = false;
// //alert(op1 && op2);
// //alert(op1 || op2);
// //alert(!op2);


// /*Attribution operators*/
// var a = 3;
// a+=2;
// a-=3;
// a*=3;
// a/=2;
// //alert(a);

// /*Other operators*/
// var age = 16;
// var permision = (age>=18) ? true : false;//Ternary
// Person = {
// 	name : "William";
// 	age: 16;
// }
// delete Person.age;
// //alert(Person);
// //alert("name" in Person);
// //alert("age" in Person);
// var age = new Number(31);
// alert(age instanceof String);

function imcCalculate(){
	var form = document.getElementById("imc_form");
	var weight = parseFloat(form.weight.value);
	var hight = parseFloat(form.hight.value);
	var imc = parseFloat((weight / (hight*hight)).toFixed(2));
	form.imc.value = imc;
}