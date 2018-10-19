package oo.day02;
//学生类的测试类
public class StudentTest {
	public static void main(String[] args){
		Student zs1 = new Student("zhangsan");
		Student zs2 = new Student("zhangsan",21);
		Student zs3 = new Student("zhangsan",21,"JMS");
		
		zs1.sayHi();
		zs2.sayHi();
		zs3.sayHi();
	}
}
