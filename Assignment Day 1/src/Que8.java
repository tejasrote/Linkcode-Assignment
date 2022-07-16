import java.lang.reflect.Array;
import java.util.Scanner;

public class Que8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1 = args[0];
		String s2 = args[1];
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);

		int[] arr = new int[]{7,25,5,19,30};

		boolean flag = false;
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if((n1 == arr[i]) && (n2 == arr[j])) {
					flag = true;
					break;
				}
			}
		}
		
		if(flag) {
			System.out.println("Its Bingo..");
		}
		else {
			System.out.println("not found..");
		}
		

	}

}
