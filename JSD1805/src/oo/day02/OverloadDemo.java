package oo.day02;
//������ʾ
/*
 * 1��ͬһ���ļ��У����Դ��������
 * 2��public���ε��ֻ࣬����һ��
 * 3��public���ε��࣬�������ļ�����ͬ
 */
public class OverloadDemo {
	public static void main(String[] arge){
		Aoo a = new Aoo();
		a.say();
		a.say(21);
		a.say("zahngsan");
		a.say("zhangsan",21);
		a.say(21,"zhangsan");
		//a.say(2.3);������󣬲������ط���
		
		Boo b = new Boo();
		b.str();
		b.str(21);
		b.str("lisi");
		b.str(12.3);
		b.str("lisi",32);
		b.str(32,"lisi");
	}
}

class Aoo{
	void say(){}
	void say(String name){}
	void say(int age){}
	void say(String name,int age){}
	void say(int age,String name){}
	
	//int say(){return 1;}//������������뷵��ֵ�����޹�
	//void say(String address){}//�����������������б��޹�
}

class Boo{
	void str(){}
	void str(int age){}
	void str(String name){}
	void str(double salary){}
	void str(String name,int age){}
	void str(int age,String name){}
	
	//double str(double salary){return 1.02}//������������뷵��ֵ�����޹�
	//void str(String address){}//�����������������б��޹�
}