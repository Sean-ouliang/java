package day06;
//��������ʾ
public class MethodDemo {
	public static void main(String[] args){
		say();
		sayHi("oulaing");
		sayHello("ouliang",21);
		saySB("ouliang",21,"chengdu");
		int a = 5;
		int b = 3;
		int d = result(6,5);
		System.out.println(d);
		int c = result(a,b);
		System.out.println(c);
		a();
	}
	
	public static void a(){
		System.out.println("111");
		b();
		System.out.println("444");
	}
	
	public static void b(){
		System.out.println("222");
		c();
	}
	
	public static void c(){
		System.out.println("333");
	}
	
	//�в��з���ֵ
	public static int result(int a,int b){
		return a+b;
	}
	
	//�в��޷���ֵ
	public static void saySB(String name,int age,String adderes){
		System.out.println("�ҽ�"+name+"������"+age+"���ˣ���ס"+adderes);
	}
	//�в��޷���ֵ
	public static void sayHello(String name,int age){
		System.out.println("�ҽ�"+name+"������"+age+"����");
	}
	//�в��޷���ֵ
	public static void sayHi(String name){
		System.out.println("�ҽ�"+name);
	}
	//�޲��޷���ֵ
	public static void say(){
		System.out.println("�ҽ�oulaing");
	}
}
