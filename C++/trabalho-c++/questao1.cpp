#include <iostream>
#include <vector>
#include <initializer_list>
#include <algorithm>;
using namespace std;

class Polinomio
{
private:
	vector<double> coeficientes;//armazena os coeficientes do polinômio
public:
	Polinomio(initializer_list<double> numeros) : coeficientes(numeros){}//inicializa os coeficientes com numeros que serão passados no instanciamento da classe
	void ordenaCoeficientes(){
		sort(this->coeficientes.begin(), this->coeficientes.end());//ordena os coeficientes em ordem crescente
	}

	vector<double>::iterator getIteradorCoeficiente(double coeficiente){
		///Retorna iterador que aponta para a posicão onde o coeficiente foi encontrado
		///Se não for encotrado retorna o end do vector, que é a ultima posição e fica logo após o último elemento
		return find(this->coeficientes.begin(), this->coeficientes.end(), coeficiente);
	}

	void insereCoeficiente(double coeficiente, int posicao){
		///busca posicao onde o coeficente está
		vector<double>::iterator it = getIteradorCoeficiente(coeficiente);

		///se o coeficiente já existia antes excli o mesmo (pois ele já foi inserido em outra posição)
		if(it != this->coeficientes.end()){
			this->coeficientes.erase(it);
		}

		///insere na posição desejada
		this->coeficientes.insert(this->coeficientes.begin()+posicao, coeficiente);
		//EXEMPLO: os coeficientes são 3 5 7 2 4, e eu quero inserir o 5 na posição 3 (indexado de 0)
		///insere ele na posição desejada, resultando em 3 5 7 5 2 4
		///exclui ele da antiga posição, resultando em 3 7 5 2 4
		///RESULTADO:
		///antes: 3 5 7 2 4   -   depois: 3 7 5 2 4

	}

	int getGrau(){
		///Imprimindo coeficientes
		cout << "Coeficientes: ";
		for(unsigned i=0; i<this->coeficientes.size(); ++i) cout << this->coeficientes[i] << " ";
		cout << endl;
		///Retornando grau do polinômio, que é igual a quantidade de coneficientes -1
		return this->coeficientes.size() - 1;
	}
};

int main(){
	Polinomio * polinomios[10];
	initializer_list<double> coeficientes = {2.0, 7.5, 3.0, 3.3, 1.5};

	///inicializando polinomios
	for(int i=0; i<10; i++){
        polinomios[i] = new Polinomio(coeficientes);
	}
	polinomios[3]->getGrau();
}
