package oo.day01;
//ѧ��������
public class StudentTest {
	public static void main(String[] args){
		
		Student ls = new Student();
		ls.name = "lisi";
		ls.age = 21;
		ls.address = "�ɶ�";
		ls.study();
		ls.sayHi();
		
		Student zs = new Student();
		zs.name = "zhangsan";
		zs.age = 22;
		zs.address = "�Ĵ�";
		zs.study();
		zs.sayHi();
		
		Student ww = new Student();
		ww.study();
		ww.sayHi();
	}
}
