#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h> //chamada de sistema que realiza operações de controle em um descritor de arquivo
#include <sys/shm.h> //facilitador de memória compartilhada
#include <sys/stat.h> //define a estrutura dos dados retornados pelas funções fstat(), lstat() e stat().

int main(){
	const int SIZE = 4096;//o tamanho (em bytes) do objeto de memória compartilhada

	const char * name = "OS";//nome do objeto de memória compartilhada

	int shm_fd;//descritor de arquivo da memória compartilhada

	void *ptr;//ponteiro para o objeto de memória compartilhada

	shm_fd = shm_open(name, O_RDONLY, 0666);//abre o objeto de memória compartilhada

	ptr = mmap(0, SIZE, PROT_READ, MAP_SHARED, shm_fd, 0);//mapeia o objeto de memória compartilhada para a memória

	printf("%s", (char *)ptr);//lê a partir do objeto de memória compartilhada

	shm_unlink(name);//remove o objeto de memória compartilhada
	
	return 0;
}
