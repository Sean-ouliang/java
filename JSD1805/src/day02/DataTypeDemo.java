package day02;
//基本数据类型的演示
public class DataTypeDemo {
	public static void main(String[] args){
		char i1 = 25105;
		char i2 = 29233;
		char i3 = 20320;
		System.out.print(i1);
		System.out.print(i2);
		System.out.println(i3);
		
		int a = 5;
		long b = a;
		int c = (int)b;
		long d = 10000000000l;
		int e = (int)d;
		System.out.println(e);//溢出
		double f = 56.954;
		int g = (int)f;
		System.out.println(g);//56
		short s1 = 5;
		short s2 = 6;
		short s3 = (short)(s1+s2);
		System.out.println(2+2);//4
		System.out.println(2+'2');//52
		
		
		
		System.out.println('我'+'你');
		
		
		boolean b1 = true;
		boolean b2 = false;
		//boolean b3 = 25.678;
		char c1 = '男';
		char c2 = 'm';
		char c3 = '5';
		char c4 = ' ';
		//char c5 = '';
		//char c6 = '男性';
		char c7 = 97;
		System.out.println(c7);//a
		char c8 = '\'';
		System.out.println(c8);//'
		
		
		/*
		int a = 25;
		//int b = 10000000000;
		System.out.println(5/2);//2
		System.out.println(2/5);//0
		System.out.println(5/2.0);//2.5
		int c = 2147483647;
		c = c + 1;
		System.out.println(c);//-2147483648
		long d = 10000000000l;
		long e = 1000000000*2*10l;
		System.out.println(e);//20000000000
		long f = 1000000000*3*10l;
		System.out.println(f);
		long g = 1000000000l*3*10;
		System.out.println(g);//30000000000
		long h = System.currentTimeMillis();
		System.out.println(h);
		double i = 25.678;
		double j = 6.0,k = 4.9;
		System.out.println(j-k);//1.0999999999999996
		*/
	}
}
