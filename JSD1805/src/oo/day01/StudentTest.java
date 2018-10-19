package oo.day01;
//学生测试类
public class StudentTest {
	public static void main(String[] args){
		
		Student ls = new Student();
		ls.name = "lisi";
		ls.age = 21;
		ls.address = "成都";
		ls.study();
		ls.sayHi();
		
		Student zs = new Student();
		zs.name = "zhangsan";
		zs.age = 22;
		zs.address = "四川";
		zs.study();
		zs.sayHi();
		
		Student ww = new Student();
		ww.study();
		ww.sayHi();
	}
}
