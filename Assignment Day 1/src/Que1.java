import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number For Even Nos You Want : ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+"\t");
			}
		}
	}

}
