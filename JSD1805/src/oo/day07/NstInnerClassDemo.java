package oo.day07;

public class NstInnerClassDemo {
	public static void main(String[] args){
		Aoo o1 = new Aoo(){
			
		};
		
		Aoo o2 = new Aoo(){
			
		};
		
		int num = 5;
		Boo o3 = new Boo(){
			void show(){
				System.out.println("showshow");
				System.out.println(num);
			}
		};
		o3.show(); 
		System.out.println("BS");
	}
}
abstract class Boo{
	abstract void show();
}
abstract class Aoo{
	
}
