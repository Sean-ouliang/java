package day07;

import java.util.Scanner;

//猜字符小游戏
public class GuessingGame {
	/**主方法*/
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char[] chs = generate();//获取随机字符数组
		System.out.println(chs);
		int score = 0;//得分
		int count = 0;//猜错次数
		while(true){//自造死循环
			System.out.println("猜吧!");
			String str = scan.next().toUpperCase();//接收输入，并将输入的字母改成大写字母
			if(str.equals("EXIT")){//对比输入，当输入exit结束循环
				System.out.println("下次再来吧!");
				break;//跳出循环
			}
			char[] input = str.toCharArray();//将字符串转换为字符数组
			int[] result = check(chs,input);//传参
			if(result[0]==chs.length){//位置数等于随机字符数组长度时，表示猜对了
				score = chs.length*100-count*10;
				System.out.println("恭喜你，猜对了，得分为："+score);
				break;//猜对了，结束游戏
			}else{
				count++;
				System.out.println("猜错了，猜对字符数为："+result[1]+"猜对位置数为："+result[0]);
			}
		}
	}
	
	/**生成随机字符数组*/
	public static char[] generate(){
		char[] chs = new char[5];//随机字符数组
		char[] letters = {'A','B','C','D','E','F','G','G','H','I','J',
				'K','L','M','N','O','P','Q','R','S','T','U','V','W',
				'X','Y','Z'};//字符范围数组
		boolean[] flags = new boolean[letters.length];
		for(int i=0;i<chs.length;i++){//遍历随机字符数组
			int index;
			do{
				index = (int)(Math.random()*letters.length);//获取下标
			}while(flags[index]);
			chs[i] = letters[index];//基于下标index到letters数组中取值
			flags[index] = true;
		}
		/*
		 * i=0  index=0       chs[0]='A'  flags[0]=true
		 * i=1  index=25      chs[25]='Z' flags[25]=true
		 * i=2 ....
		 * i=3 ....
		 */
		/*
		 * i=0 index=0  chs[0]='A'
		 * i=1 index=3  chs[3]='D'
		 */
		return chs;
	}
	
	/**对比：随机字符数组chs与用户输入的字符数组input*/
	public static int[] check(char[] chs,char[] input){
		int[] result = new int[2];//假设result[0]为位置对，result[1]为字符对
		for(int i=0;i<chs.length;i++){//遍历随机字符数组
			for(int j=0;j<input.length;j++){//遍历用户输入字符数组
				if(chs[i]==input[j]){//字符对
					result[1]++;//字符对个数增1
					if(i==j){//位置对
						result[0]++;//位置对个数增1
					}
					break;//剩余input元素不再参与比较了
				}
			}
		}
		return result;
	}
}
