package oo.day04;
//向上造型演示
public class UploadDemo {
	public static void main(String[] args){
		Aoo a = new Aoo();
		a.a = 12;
		a.show();
		
		Boo b = new Boo();
		b.b = 15;
		b.test();
		
		Aoo c = new Boo();
		c.a = 45;
		c.show();
		//c.b = 56;//编译错误，能点出来什么看引用类型
	}
}
class Aoo{
	int a;
	void show(){
	}
}
class Boo extends Aoo{
	int b;
	void test(){
	}
}