package oo.day08;
//Debugµ÷ÊÔ
public class DeBugDemo {
	public static void main(String[] args){
		int a = 12;
		int b = 8;
		show(a);
		a = 15;
		test(a,b);
		System.out.println("555");
		System.out.println("666");
		System.out.println("777");
	}
	public static void show(int num){
		if(num>10){
			System.out.println("111");
		}else{
			System.out.println("222");
		}
	}
	public static void test(int num1,int num2){
		int count = num1+num2;
		int score = 0;
		int getCount = 0;
		int getScore = 0;
		for(int i=1;i<count;i++){
			score++;
			if(score>16){
				System.out.println(getCount++);
			}else{
				getScore--;
				System.out.println("333");
			}
		}
	}
}
