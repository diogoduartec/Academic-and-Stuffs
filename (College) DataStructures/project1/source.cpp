/* sourse.cpp
 * Created by Diogo Duarte on 30/04/2018
 *
 * implementing first AED project
*/

#include <iostream>
using namespace std;


class Soldier{
private:
	string name;
	int power;
public:
	Soldier(string name, int power){
		this->power = power;
		this->name = name;
	}
	
	void setName(string name){
		this->name = name;
	}

	string getName(){
		return this->name;
	}

	void setPower(int power){
		this->power = power;
	}
	
	int getPower(){
		return this->power;
	}
	void print(){
		cout << this->power << " - " << this->name << endl;
	}
};

template <class  Type>
class Node{
private:
	Type * item;
	Node * next;

public:
	Node(){}
	Node(Type * item){
		this->item = item;
		this->next = NULL;
	}

	Node(Type * item, Node * next){
		this->item = item;
		this->next = next;
	}

	void setItem(Type * item){
		this->item = item;
	}

	Soldier* getItem(){
		return this->item;
	}

	void setNext(Node * next){
		this->next = next;
	}

	Node<Type>* getNext(){
		return this->next;
	}
};

template <class Type>
class Stack{
private:
	Node<Type> * top;
public:
	Stack(){
		this->top = NULL;
	}
	void push(Type * item){
		Node<Type>* newNode = new Node<Type>(item);
		newNode->setNext(top);
		top = newNode;
	}
	void pop(){
		if(top != NULL){
			Node<Type> * toRemove = top;
			top = top->next;
			delete toRemove;
		}
	}
	Type* getTop(){
		return top->getItem();
	}
};


int main(){
	Stack<Soldier> * soldies = new Stack<Soldier>();
	Soldier * s1 = new Soldier("Mailkerson", 20);
	Soldier * s2 = new Soldier("Jamal", 30);
	soldies->push(s1);
	soldies->push(s2);
	s1 = soldies->getTop();
	s1->print();

}