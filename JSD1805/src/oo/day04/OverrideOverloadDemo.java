package oo.day04;

public class OverrideOverloadDemo {
	public static void main(String[] args){
		
		//重写看参数/引用，重写看对象
		Goo goo = new Goo();
		Eoo o = new Foo();
		goo.test(o);//重载看参数(Eoo)

		
		Foo f = new Foo();
	}
}

class Goo{
	void test(Eoo o){
		System.out.println("超类型参数");
		o.show();
	}
	void test(Foo o){
		System.out.println("派生类型参数");
		o.show();
	}
}
class Eoo{
	Eoo(){
		System.out.println("a");
	}
	void show(){
		System.out.println("超类show");
	}
}
class Foo extends Eoo{
	Foo(){
		super();
		System.out.println("b");
	}
	void show(){
		System.out.println("派生类show");
	}	
}