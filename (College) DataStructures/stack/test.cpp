
/* test.cpp
 * Created by Diogo Duarte on 05/05/2018
 *
 * testing stack.h
*/

#include <iostream>
#include "stack.h"

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
	Stack<Person> * stack = new Stack<Person>();
	Person * p1 = new Person("Diogo", 19, "GodKnows, it, 171", "123-5789");
	Person * p2 = new Person("Natalia", 19, "GodKnows, it, 172", "987-6321");
	stack->push(p1);
	stack->push(p2);
	stack->getTop()->print();
	return 0;
}