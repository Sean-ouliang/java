package oo.day04;

public class OverrideDemo {
	public static void main(String[] args){
		
	}
}
class Coo{
	void show(){}
	double test(){return 0.0;}
	Coo sayHi(){return null;}
	Doo say(){return null;}
}
class Doo extends Coo{
	//void show(){return 1}
	//int test(){return 0;}
	Doo sayHi(){return null;}
	//Coo say(){return null;}
}
