package oo.day03;

public class SuperDemo {
	public static void main(String[] args){
		Boo b = new Boo();
		Doo c = new Doo(2,3);
	}
}
class Aoo{
	Aoo(){
		System.out.println("超类构造方法");
	}
}
class Boo extends Aoo{
	Boo(){
		System.out.println("派生类构造方法");
	}
}
class Coo{
	Coo(int a){
		System.out.println("a="+a);
	}
}
class Doo extends Coo{
	Doo(int a,int b){
		super(a);
		System.out.println("a+b="+(a+b));
	}
}