package day07;
/**½ğ×ÖËş*/
public class Test01 {
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int n=1;n<=2*i-1;n++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
