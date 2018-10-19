package oo.day04;

public class TestDemo {
	public static void main(String[] args){
		Persons[] ps = new Persons[5];
		ps[0] = new Students("zahngsan",21,"LF","101");
		ps[1] = new Students("lisi",22,"JMS","102");
		ps[2] = new Teachers("wangwu",23,"CD",12000);
		ps[3] = new Teachers("zhaoliu",24,"BZ",13000);
		ps[4] = new Doctors("qianqi",25,"LS","主治医师");
		for(int i=0;i<ps.length;i++){
			ps[i].sayHi();
		}
		System.out.println();
		Students zs = new Students("zahngsan",26,"DZ","103");
		zs.sayHi();
		Persons ls = new Students("lisi",27,"CQ","104");
		zs.sayHi();
	}
}
class Persons{
	String name;
	int age;
	String address;
	
	Persons(String name,int age,String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	void sayHi(){
		System.out.println("我叫"+name+"今年"+age+"岁了，家住"+address);
	}
}
class Students extends Persons{
	String stuId;
	Students(String name,int age,String address,String stuId){
		super(name,age,address);
		this.stuId = stuId;
	}
	void sayHi(){
		System.out.println("我叫"+name+"今年"+age+"岁了，家住"+address+"，学号："+stuId);
	}
}
class Teachers extends Persons{
	double salary;
	Teachers(String name,int age,String address,double salary){
		super(name,age,address);
		this.salary = salary;
	}
	void sayHi(){
		System.out.println("我叫"+name+"今年"+age+"岁了，家住"+address+"，工资："+salary);
	}
}
class Doctors extends Persons{
	String level;
	Doctors(String name,int age,String address,String level){
		super(name,age,address);
		this.level = level;
	}
	void sayHi(){
		System.out.println("我叫"+name+"今年"+age+"岁了，家住"+address+"，职位是"+level);
	}
}



