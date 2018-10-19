package oo.day04;

public class Person {
	String name;
	int age;
	String address;
	Person(String name,int age,String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	void sayHi(){
		System.out.println("我叫"+name+"，今年"+age+"岁了，家住"+address);
	}
}
class Student extends Person{
	String stuId;
	Student(String name,int age,String address,String stuId){
		super(name,age,address);
		this.stuId = stuId;
	}
	void sayHi(){
		System.out.println("我叫"+name+"，今年"+age+"岁了，家住"+address+"，学号："+stuId);
	}
}
class Teacher extends Person{
	double salary;
	Teacher(String name,int age,String address,double salary){
		super(name,age,address);
		this.salary = salary;
	}
	void sayHi(){
		System.out.println("我叫"+name+"，今年"+age+"岁了，家住"+address+"，工资："+salary);
	}
}
class Doctor extends Person{
	String level;
	Doctor(String name,int age,String address,String level){
		super(name,age,address);
		this.level = level;
	}
}
