package day06;
//��ҵ
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
		System.out.println("�����");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		/*
		 * ð������
		 * 	1��10��Ԫ��ð9��
		 * 	2��1��ÿһ�ֶ��Ǵӵ�һ��Ԫ�ؿ�ʼð
		 * 	  2��ÿһ�ζ��Ǻ�����һ��Ԫ�رȽ�
		 * 	3��ð���������Ͳ��ٲ���Ƚ���
		 */
	}
}
