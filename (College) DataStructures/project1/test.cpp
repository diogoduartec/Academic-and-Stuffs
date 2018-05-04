#include <iostream>
using namespace std;

class Person{
private:
	int age;
	string name;
public:
	Person(int age, string name): age(age), name(name){}

	void print(){
		cout << age << endl << name << endl;
	}
};

template <class Type>
class Test{
private:
	Type * t;
public:
	Test(Type * t): t(t){}
	Type* getType(){ // Faltava só fazer Type* getType() invés de Type getType() como estava antes
		return t;
	}
};

int main(){
	Person * person = new Person(15, "Maria");
	Test<Person> * test = new Test<Person>(person);
	Person * p = test->getType();
	p->print();

	return 0;
}