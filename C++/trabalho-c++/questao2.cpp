#include <bits/stdc++.h>
using namespace std;

//função que retorna se uma string é palindromo

bool ehPalindromo(string s){
	//este for compara os ultimos elentos com os primeiros
	//por exemplo: arara
	//(a)rar(a)
	// ^     ^     -- compara o primeiro 'a' com o ultimo 'a'
	//a(r)a(r)a
	//  ^   ^      -- compara o segundo 'r' com o penultimo 'r'
	for(int i=0, j=s.size()-1; i<j; i++, j--){
		if(s[i]!=s[j]) return false; //note que se os elementos não forem iguais vai retornar false
	}
	return true;//se sair do for, quer dizer que não retornou false, logo é true
}

int main(){
	string entrada;
	cin >> entrada >> endl;
	cout << (ehPalindromo(entrada) ? "Eh Palindromo" : "Nao eh palindromo") << endl;
}
