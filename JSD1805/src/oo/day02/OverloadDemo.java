package oo.day02;
//重载演示
/*
 * 1）同一个文件中，可以创建多个类
 * 2）public修饰的类，只能有一个
 * 3）public修饰的类，必须与文件名相同
 */
public class OverloadDemo {
	public static void main(String[] arge){
		Aoo a = new Aoo();
		a.say();
		a.say(21);
		a.say("zahngsan");
		a.say("zhangsan",21);
		a.say(21,"zhangsan");
		//a.say(2.3);编译错误，不是重载方法
		
		Boo b = new Boo();
		b.str();
		b.str(21);
		b.str("lisi");
		b.str(12.3);
		b.str("lisi",32);
		b.str(32,"lisi");
	}
}

class Aoo{
	void say(){}
	void say(String name){}
	void say(int age){}
	void say(String name,int age){}
	void say(int age,String name){}
	
	//int say(){return 1;}//编译错误，重载与返回值类型无关
	//void say(String address){}//编译错误，重载与参数列表无关
}

class Boo{
	void str(){}
	void str(int age){}
	void str(String name){}
	void str(double salary){}
	void str(String name,int age){}
	void str(int age,String name){}
	
	//double str(double salary){return 1.02}//编译错误，重载与返回值类型无关
	//void str(String address){}//编译错误，重载与参数列表无关
}