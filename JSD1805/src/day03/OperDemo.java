package day03;
import java.util.Scanner;
//运算符演示
public class OperDemo {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份:");
		int year = scan.nextInt();
		if(year%4 == 0 && year%100 != 0 || year%400 == 0){
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"不是闰年");
		}
		boolean flag = (year%4 == 0 && year%100 != 0 || year%400 == 0);
		String str = flag?year+"是闰年":year+"不是闰年";
		System.out.println(str);
		
		
		
		/*
		int a = 5;
		a += 10;
		System.out.println(a);//15
		a *= 3;
		System.out.println(a);//45
		a -= 4;
		System.out.println(a);//41
		int age = 37;
		System.out.println("age="+age);
		System.out.println("我今年"+age+"岁了");
		System.out.println(10+20+""+30);//3030
		System.out.println(10+20+"");//30
		System.out.println(""+10+20);//1020
		int b=10,c=6;
		int max = b>c?b:c;
		System.out.println("max="+max);//10		
		*/
		
		/*
		//面试题
		char s = 5;
		s += 10;//自带强转
		//s = s+10;//需强转
		s = (char)(s+10);
		*/
		
		/*
		int a = 5,b = 10,c = 5;
		System.out.println(a>=c && a>b);//false
		System.out.println(a>b && b>=c);//false
		System.out.println(b>a && a<=c);//true
		System.out.println(b<=a && a!=c);//false
		System.out.println(a==c || c>b);//true
		System.out.println(c!=a || b>a);//true
		System.out.println(a==c || b>=c);//true
		System.out.println(a!=c || a>b);//false
		System.out.println(!(b<a));//true
		System.out.println(!(a==c));//false
		int d = 10,e = 5,f = 10;
		System.out.println(d>e);//true
		System.out.println(e<f);//true
		System.out.println(d>=f);//true
		System.out.println(e<=d);//true
		System.out.println(d==f);//true
		System.out.println(e!=f);//true
		int m = 20,n = 10,z = 20;
		System.out.println(m!=z && n<z);//false
		System.out.println(z==m || m<=n);//true
		*/
		
		/*
		System.out.println(5%3);//2
		System.out.println(9%3);//0
		System.out.println(3%9);//3
		int a = 5;
		a++;
		System.out.println(a);//6
		int b = 5;
		++b;
		System.out.println(b);//6
		int c = 5;
		int d = c++;
		System.out.println(c);//6
		System.out.println(d);//5
		int e = 5;
		int f = ++e;
		System.out.println(e);//6
		System.out.println(f);//6
		int g=5,h=5;
		System.out.println(g--);//5
		System.out.println(g);//4
		System.out.println(--h);//4
		System.out.println(h);//4
		*/
	}
}
