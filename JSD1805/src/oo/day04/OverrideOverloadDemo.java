package oo.day04;

public class OverrideOverloadDemo {
	public static void main(String[] args){
		
		//��д������/���ã���д������
		Goo goo = new Goo();
		Eoo o = new Foo();
		goo.test(o);//���ؿ�����(Eoo)

		
		Foo f = new Foo();
	}
}

class Goo{
	void test(Eoo o){
		System.out.println("�����Ͳ���");
		o.show();
	}
	void test(Foo o){
		System.out.println("�������Ͳ���");
		o.show();
	}
}
class Eoo{
	Eoo(){
		System.out.println("a");
	}
	void show(){
		System.out.println("����show");
	}
}
class Foo extends Eoo{
	Foo(){
		super();
		System.out.println("b");
	}
	void show(){
		System.out.println("������show");
	}	
}