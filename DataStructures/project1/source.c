#include <stdio.h>
#include <string.h>

typedef struct node{
	char name[50];
	int power;
	struct node *next;
}Node;

void createStack(Node** top){
	(*top) = NULL;
}

int isEmpty(Node * node){
	if(node == NULL) return 1;
	return 0;
}

Node * newNode(char * name, int power){
	Node * node = (Node*) malloc(sizeof(Node));
	//node->name = name;
	strcpy(node->name, name);
	node->power = power;
	node->next = NULL;
	return node;
};

void push(Node** top, Node* node){
	if(isEmpty(*top)) (*top) = node;
	else{
		node->next = (*top);
		(*top) = node;
	}
}

void pop(Node** top){
	if(!isEmpty(*top)){
		Node * trash = (*top);
		(*top) = (*top)->next;
		free(trash);	
	}
}

Node getTop(Node* top){
	return (*top);
}

Node * copyStack(Node ** srcStack){
    Node aux;    
	Node * stepStack; //This is an a auxiliar stack for dont lose the original
	Node * resultStack;
	createStack(&stepStack);
	createStack(&resultStack);	
	while(!isEmpty(*srcStack)){//vai repetir pq to passando referencia
		aux = getTop(*srcStack);
		Node * node1 = newNode(aux.name, aux.power);
		Node * node2 = newNode(aux.name, aux.power);
		
		push(&stepStack, node1);
		push(&resultStack, node2);
		
		pop(srcStack);
	}
	while(!isEmpty(stepStack)){
		aux = getTop(stepStack);
		Node * node = newNode(aux.name, aux.power);
		pop(&stepStack);
		push(srcStack, node);
	}
	return resultStack;
}

void printStack(Node * top){
	Node * iterator;
	for(iterator = copyStack(&top); iterator!=NULL; pop(&iterator)){
		printf("%s\n", iterator->name);
		printf("%d\n", iterator->power);
	}
}

int main(){
	int i, p;
	char name[50];
	Node * stack;
	createStack(&stack);
	Node * node;
	for(i=0; i<4; i++){
		scanf("%s", &name);
		scanf("%d", &p);
		node = newNode(name, p);
		push(&stack, node);
	}
	printf("first\n");
	printStack(stack);
	printf("second\n");
	printStack(stack);
	return 0;
}