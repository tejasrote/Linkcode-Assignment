import java.util.Scanner;
public class Bookmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Bookinfo bkinfo=new Bookinfo();
		Book bkarr[]=null;
		do
		{
		System.out.println("1-Create Book Shell\n2-Display Books\n3-Search Book");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			 bkarr=bkinfo.create();
			break;
		case 2:
			bkinfo.display(bkarr);
			break;
		case 3:
			System.out.println("Enter Name of the book :");
			String search=sc.next();
			String i=bkinfo.search(args, search);
			break;
			default :
				System.out.println("Invalid Credentials...........");
		}
		System.out.println("Do you want to continue(yes/no)");
		}while(sc.next().equals("yes"));
		
		System.out.println("----------------------THANK YOU----------------------");
	}

}
