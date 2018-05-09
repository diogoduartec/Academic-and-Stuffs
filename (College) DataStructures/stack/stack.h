/* stack.h
 * Created by Diogo Duarte on 05/05/2018
 *
 * Stack data structure implementation
*/

#ifndef Stack_h
#define Stack_h

template <class Type>
class Node{
private:
	Type * item;
	Node * next;
public:
	
	Node(){
		this->next = NULL;
	}
	
	Node(Type * item){
		this->item = item;
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

template<class Type>
class Stack{
private:
	Node<Type> * top;
public:
	Stack(){
		this->top = NULL;
	}
	void push(Type * item){
		Node<Type> * newNode = new Node<Type>(item);
		newNode->setNext(top);
		top = newNode;
	}
	void pop(){
		Node<Type> * trash = this->top;
		top = top->getNext();
		delete trash;
	}
	Type * getTop(){
		return top->getItem();
	}
};

#endif