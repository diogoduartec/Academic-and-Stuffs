#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <fcntl.h>
#include <sys/shm.h>
#include <sys/stat.h>


int main(){

const int SIZE = 4096; //o tamanho (em bytes) do objeto de memória compartilhada

const char *name = "OS";//nome do objeto de memória compartilhada


/*items gravados na memória compartilhada*/
const char *message0 = "OS";
const char *message1 = "is";
const char *messege2 = "topper";

int shm_fd;// descritor de arquivos da memória compartilhada

void *ptr; //ponteiro para um objeto de memória compartilhada 

shm_fd = shm_open(name, O_CREAT | O_RDWR, 0666);//criando objeto de memória compartilhada

ftruncate(shm_fd, SIZE);

ptr = mmap(0, SIZE, PROT_WRITE, MAP_SHARED, shm_fd, 0);
sprintf(ptr, "%s", message0);
ptr += strlen(message0);

sprintf(ptr, "%s", message1);
ptr += strlen(message1);

sprintf(ptr, "%s", message2);
ptr += strlen(message2);
}
