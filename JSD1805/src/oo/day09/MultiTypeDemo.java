package oo.day09;
//多态演示
public class MultiTypeDemo {
	public static void main(String[] args){
		Aoo o = new Boo();//向上造型
		Boo o1 = (Boo)o;//o所指向的对象就是Boo类型
		Inter1 o2 = (Inter1)o;//o所指向的对象实现了Inter1接口
		//Coo o3 = (Coo)o;//ClassCastException类型转换异常
		if(o instanceof Coo){
			Coo o4 = (Coo)o;
		}else{
			System.out.println("SB");
		}
	}
}
interface Inter1{
	
}
class Aoo{
	
}
class Boo extends Aoo implements Inter1{
	
}
class Coo extends Aoo{
	
}