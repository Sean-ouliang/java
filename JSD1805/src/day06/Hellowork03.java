package day06;
//��ҵ
public class Hellowork03 {
	public static void main(String[] args){
		int[] arr = generateArray(3,10);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	//�����������
	public static int[] generateArray(int a,int num){
		int[] arr = new int[a];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*num);
		}
		return arr;
	}
}
