#include <stdlib.h>
#include <string.h>
#include "hashtable.h"

struct hash{
	int qtd, TABLE_SIZE;
	struct aluno **itens;
};

