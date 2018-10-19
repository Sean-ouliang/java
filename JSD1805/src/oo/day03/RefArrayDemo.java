package oo.day03;
//引用类型数组的演示
public class RefArrayDemo {
	public static void main(String[] args){
		Student[] stus = new Student[3];
		stus[0] = new Student("zhangsan",21,"LF");
		stus[1] = new Student("lisi",24,"JMS");
		stus[2] = new Student("wangwu",34,"SD");
		System.out.println(stus[0].age);
		stus[1].sayHi();
		
		Student[] st = new Student[]{
			new Student("zahngsan",21,"LF"),
			new Student("lisi",24,"JMS"),
			new Student("wangwu",34,"SD")
		};
		st[2].sayHi();
		
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[2];
		arr[1][2] = 100;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		int[][] as = new int[3][4];
		for(int i=0;i<as.length;i++){
			for(int j=0;j<as[i].length;j++){
				as[i][j] = 100;
				System.out.print(as[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
