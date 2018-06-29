#include <iostream>
#include <stdio.h>
#include <vector>

using namespace std;


///função auxiliar que imprime uma lista de strings
void imprimeLista(vector<string> lista){
	for(int i=0; i<lista.size(); i++) cout << lista[i] << endl;
}
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
	vector<string> listaArquivos;

    cout << "digite a string com o caminho, arquivo e extensao (ex c:\\src\\pasta\\programa.c):"<< endl;
    cin >> entrada;
    cout <<"Nome do arquivo: " << getNomeArquivo(entrada) << endl;
    cout <<"Extensao do arquivo: " << getExtensaoArquivo(entrada) << endl << endl;



    string frase = "Eu ouvi que ele ate funciona se voce nao acreditar";
    frase = troca(frase, "Eu ouvi que ", "");
    frase = troca(frase, "ate", "as vezes");
    frase = troca(frase, "voce nao", "eu");
    cout <<"resultado: " << frase << endl;
    return 0;
}
