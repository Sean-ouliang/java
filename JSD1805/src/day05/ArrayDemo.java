package day05;
//�������ʾ
public class ArrayDemo {
	public static void main(String[] args){
		int[] arr1 = new int[10];
		int[] arr2 = {2,5,8};
		int[] arr3 = new int[]{2,5,8};
		int[] arr = new int[3];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		//arr[3] = 400;//�����±�Խ���쳣
		System.out.println(arr[arr.length-1]);
	}
}
