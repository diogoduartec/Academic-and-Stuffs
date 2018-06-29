#include <iostream>
#include <stdio.h>
#include <vector>
#include <string>
#include <fstream>

using namespace std;

///retorna nome de um arquivo
string getNomeArquivo(string arquivo){
    string result = "";
    int i;
    for(i=arquivo.size()-1; arquivo[i] != '.'; --i);
    --i;
    for(;(arquivo[i]!='\\') && (arquivo[i]!='/'); --i){
        result = arquivo[i] + result;
    }
    return result;
}

///retorna extensao de um arquivo
string getExtensaoArquivo(string arquivo){
    string result = "";
    for(int i=arquivo.size()-1; i>=0; --i){
        if(arquivo[i] == '.') break;
        result = arquivo[i] + result;
    }
    return result;
}

///transformando strings
string troca(string total, string parte, string nova_parte){
    int position = total.find(parte);
    return total.replace(position, parte.size(), nova_parte);
}

int main(){
	string entrada, nomeArquivo, extensaoArquivo, numero, concatenado;

	string linha;
    ifstream arquivo ("arquivo_questao4.txt");

    if(arquivo.is_open()){
        if(arquivo.good()){
            getline(arquivo, linha);
        }
    }

    cout <<"Nome do arquivo: " << getNomeArquivo(linha) << endl;
    cout <<"Extensao do arquivo: " << getExtensaoArquivo(linha) << endl << endl;

    string frase = "Eu ouvi que ele ate funciona se voce nao acreditar";
    frase = troca(frase, "Eu ouvi que ", "");
    frase = troca(frase, "ate", "as vezes");
    frase = troca(frase, "voce nao", "eu");
    cout <<"resultado: " << frase << endl;
    return 0;
}
