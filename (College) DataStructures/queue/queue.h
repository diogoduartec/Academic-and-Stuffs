/* queue.h
 * Created by Diogo R. D. da Costa on 07/05/2018
 * 
 * queue data structure implementation
*/
#include <iostream>
using namespace std;

#ifndef Queue_h
#define Queue_h

template<class Type>
class Node{
private:
	Type * item;
	Node * next;
public:
	Node(){
		this->next = NULL;
		this->item = NULL;
	}
	Node(Type * item){
		this->item = item;
		this->next = NULL;
	}

	Type * getItem(){
		return this->item;
	}
	void setItem(Type * item){
		this->item = item;
	}

	Node<Type> * getNext(){
		return this->next;
	}

	void setNext(Node * next){
		this->next = next;
	}
};

template <class Type>
class Queue{
private:
	Node<Type> * front;
	Node<Type> * back;
public:
	Queue(){
		this->front = NULL;
		this->back = NULL;
	}
	bool isEmpty(){
		if(back == front && front == NULL) return true;
		else return false;
	}
	void enqueue(Type * item){
		cout << "aqui1" << endl;
		Node<Type> * newNode = new Node<Type>(item);
		cout << "aqui2" << endl;
		back->setNext(newNode);
		cout << "aqui3" << endl;
		back = newNode;
		cout << "aqui4" << endl;
	}
	void dequeue(){
		//if(!isEmpty()){
			Node<Type> * toDelete = front;
			front = front->getNext();
			delete toDelete;
		//}
	}
	Type * getFront(){
		return front->getItem();
	}
	Type * getBack(){
		return back->getItem();
	}
};
#endif