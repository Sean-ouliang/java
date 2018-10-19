package oo.day02;

public class NullRefDemo {
	public static void main(String[] args){
		Student zs = new Student("zhangsan",25,"LF");
		System.out.println(zs.age);
		zs = null;  
		//System.out.println(zs.age);//NullPointerException:ø’÷∏’Î“Ï≥£
		
		Student ls = new Student("lisi",21,"JMS");
		Student lss = ls;
		System.out.println(ls.age);
		lss.age = 28;
		System.out.println(ls.age);
		
		int a = 5;
		int b = a;
		System.out.println(b);
		b = 8;
		System.out.println(a);
		System.out.println(b);
	}
}
