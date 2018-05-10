/*
 *list.h
 *Created by Diogo Duarte on 
 *
 *List data structure implementation
*/

#ifndef Stack_h
#define Stack_h

template<class Type>
class Node{
private:
	Type * item;
	Node<Type> * next;
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

	void setNext(Node<Type> * next){
		this->next = next;
	}
};


template <class Type>
class List{
private:
	Node<Type> * front;
	Node<Type> * back;
public:
	List(){
		this->front = NULL;
	}
	bool isEmpty(){
		return if(back == front && front == NULL);
	}
	void push_back(Type * item){
		Node<Type> * newNode = new Node<Type>(item);
		if(isEmpty()){
			front = back = newNode;
		}
		else{
			back->setNext(newNode);
			back = newNode;
		}
	}
	void push_front(){
		Node<Type> * newNode = new Node<Type>(item);
		if(isEmpty()){
			front = back = newNode;
		}
		else{
			newNode->setNext(front);
			front = newNode;
		}
	}
	void remove(Type * item){
		Node<Type> * iterator = front, * previous = NULL, * toDelete = NULL;
		if(iterator->getItem() == item){
			toDelete = iterator->front;
			iterator = iterator->getNext();
		}
		else{
			for(; iterator!=NULL; iterator = iterator->getNext()){
				if(iterator->getItem() == item){
					toDelete = iterator;
					previous->setNext(iterator->getNext());
					break;
				}
				previous=iterator;
			}
		}
		if(toDelete!=NULL){
			delete toDelete;
		}
	}
};