package oo.day08;

public class InterfaceDemo {
	public static void main(String[] args){
//		Inter4 o1 = new Inter4();//������󣬽ӿڲ��ܱ�ʵ����
		Inter4 o2 = new Eoo();//��������
		Inter3 o3 = new Eoo();//��������
	}
}
class Aoo implements Inter2{
	public void a(){}
	public void b(){}
}
interface Inter3{
	void c();
}
class Boo implements Inter2,Inter3{
	public void a(){}
	public void b(){}
	public void c(){}
}
abstract class Coo{
	abstract void d();
}
class Doo extends Coo implements Inter2,Inter3{
	public void a(){}
	public void b(){}
	public void c(){}
	void d(){}
}
interface Inter4 extends Inter3{
	void e();
}
class Eoo implements Inter4{
	public void e(){}
	public void c(){}
}






