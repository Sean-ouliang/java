package day06;
//作业
public class Hellowork02 {
	public static void main(String[] args){
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		System.out.println("排序后：");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		/*
		 * 冒泡排序：
		 * 	1、10个元素冒9轮
		 * 	2、1）每一轮都是从第一个元素开始冒
		 * 	  2）每一次都是和它下一个元素比较
		 * 	3、冒出来的数就不再参与比较了
		 */
	}
}
