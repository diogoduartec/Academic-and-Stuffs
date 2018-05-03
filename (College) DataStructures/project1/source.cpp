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
};


class Node{
private:
	Soldier soldier;
	Node * next;

public:
	Node(){}
	Node(Soldier soldier){
		this->soldier = soldier;
		this->next = NULL;
	}

	Node(Soldier soldier, Node * next){
		this->soldier = soldier;
		this->next = next;
	}

	void setSoldier(){
		this->soldier = soldier;
	}

	Soldier getSoldier(){
		return this->soldier;
	}

	void setNext(Node * next){
		this->next = next;
	}

	Node* getNext(){
		return this->next;
	}
};

class Stack(){
private:
	Node * top;
public:
	Stack(){
		this->top = NULL;
	}
};

int main(){

}