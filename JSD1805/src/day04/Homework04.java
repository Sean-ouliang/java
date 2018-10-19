package day04;

public class Homework04 {
	public static void main(String[] args){
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*10+1);	
			System.out.println(arr[i]);
		}
		int max = arr[0];
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		System.out.println("max:"+max);
		int count = 0;
		for(int i=0;i<arr.length;i++){
			if(max==arr[i]){
				count++;
			}
		}
		System.out.println("count:"+count);
	}
}
