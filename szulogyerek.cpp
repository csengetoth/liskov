#include<iostream>

using namespace std;


class Szulo{
	public: void uzenet(){
	cout<<"I'm the parent class"<<endl;
	}
};

void fgv ( Szulo& parent) {
	parent.uzenet();
}

class Gyerek: public Szulo{
	public: void uzenet(){
	cout<<"I'm the child class"<<endl;
	}
};

int main( int argc, char **argv){

	Szulo* szulo=new Gyerek();
	szulo->uzenet();
	
	Gyerek gyerek;
	fgv(gyerek);	
}
