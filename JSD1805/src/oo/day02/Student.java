package oo.day02;
//ѧ����
public class Student {
	//��Ա����
	String name;
	int age;
	String address;
	
	Student(String name){
		this(name,0,null);
	}
	
	Student(String name,int age){
		this(name,age,null);
	}
	
	Student(String name,int age,String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//����
	void study(){
		System.out.println(name+"��ѧϰ...");
	}
	void sayHi(){
		System.out.println("��Һã��ҽ�"+name+"������"+age+"���ˣ���ס"+address);
	}
}
