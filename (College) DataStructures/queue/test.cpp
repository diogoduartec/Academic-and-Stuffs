
/* test.cpp
 * Created by Diogo R. D. da Costa on 07/05/2018
 *
 * testing queue.h
*/

#include <iostream>
#include "queue.h"

using namespace std;

class Person{
private:
	int age;
	string name;
	string address;
	string phone;
public:
	Person(){
		age = 0;
		name = "";
		address = "";
		phone = "";
	}
	
	Person(string name, int age, string address, string phone):name(name), age(age), address(address), phone(phone){}
	
	int getAge(){
		return this->age;
	}

	void setAge(int age){
		this->age = age;
	}

	string getName(){
		return this->name;
	}

	void setName(string name){
		this->name = name;
	}

	string getAddress(){
		return this->address;
	}

	void setAddress(string address){
		this->address = address;
	}

	string getPhone(){
		return this->phone;
	}

	void setPhone(string phone){
		this->phone = phone;
	}

	void print(){
		cout << this->name << endl;
		cout << this->age << endl;
		cout << this->address << endl;
		cout << this->phone << endl;
	}
};

int main(){
	Queue<Person> * queue = new Queue<Person>();
	Person * p1 = new Person("Diogo", 19, "GodKnows, it, 171", "123-5789");
	Person * p2 = new Person("Natalia", 19, "GodKnows, it, 172", "987-6321");
	queue->enqueue(p1);
	queue->enqueue(p2);
	queue->getFront()->print();
	queue->getBack()->print();
	return 0;
}