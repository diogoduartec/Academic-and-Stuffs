/*hashtable.h
 *
 *Create by Diogo R. D. da Costa
*/

struct aluno{
	int matricula;
	char nome[30];
	float n1, n2, n3;
};

typedef struct hash Hash;
Hash* criaHash(int TABLE_SIZE);
void liberaHash(Hash* ha);
int valorString(char* str);
int insereHash_SemColisao(Hash* ha, struct aluno al);
int buscaHash_SemColisao(Hash* ha, int mat, struct aluno* al);
int insereHash_EnderAberto(Hash* ha, struct aluno al);
int buscaHash_EnderAberto(Hash* ha, int mat, struct aluno* al);
Hash *h;

Hash * criaHash(int TABLE_SIZE){
	Hash* ha = (Hash*) malloc(sizeof(Hash));
	if(ha != NULL){
		int i;
		ha->TABLE_SIZE = TABLE_SIZE;
		ha->itens = (struct aluno**) malloc(TABLE_SIZE * sizeof(struct aluno*));
		if(ha->itens == NULL){
			free(ha);
			return NULL;
		}
		ha->qtd = 0;
		for(i=0; i<ha->TABLE_SIZE; i++)
			ha->itens[i] = NULL;
	}
	return ha;
}

void liberaHash(Hash* ha){
	if(ha != NULL){
		int i;
		for(i=0; i<ha->TABLE_SIZE; i++){
			if(ha->itens[i] != NULL)
				free(ha->itens[i])
		}
		free(ha->itens);
		free(ha);
	}
}

int insereHash_SemColisao(Hash* ha, struct* aluno al){
	if(ha == NULL || ha->qtd == ha->TABLE_SIZE)
		return 0;

	int chave = al.matricula;

	int pos = chaveDivisao(chave, ha->TABLE_SIZE);
	struct aluno *novo = (struct aluno*) malloc(sizeof(struct aluno));
	if(novo == NULL)
		return 0;
	*novo = al;
	ha->itens[pos] = novo;
	ha->qtd++;
	return 1;
}

int buscaHash_SemColisao(Hash* ha, int mat, struct aluno* al){
	if(ha == nulL)
		return 0;
	int pos = chaveDivisao(mat, ha->TABLE_SIZE);
	if(ha->itens[pos] = NULL)
		return 0;
	*al = *(ha->itens[pos]);
	return 1;
}

