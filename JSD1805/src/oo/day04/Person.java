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
		System.out.println("�ҽ�"+name+"������"+age+"���ˣ���ס"+address);
	}
}
class Student extends Person{
	String stuId;
	Student(String name,int age,String address,String stuId){
		super(name,age,address);
		this.stuId = stuId;
	}
	void sayHi(){
		System.out.println("�ҽ�"+name+"������"+age+"���ˣ���ס"+address+"��ѧ�ţ�"+stuId);
	}
}
class Teacher extends Person{
	double salary;
	Teacher(String name,int age,String address,double salary){
		super(name,age,address);
		this.salary = salary;
	}
	void sayHi(){
		System.out.println("�ҽ�"+name+"������"+age+"���ˣ���ס"+address+"�����ʣ�"+salary);
	}
}
class Doctor extends Person{
	String level;
	Doctor(String name,int age,String address,String level){
		super(name,age,address);
		this.level = level;
	}
}
