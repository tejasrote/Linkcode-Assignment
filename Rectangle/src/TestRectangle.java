import java.util.Scanner;
public class TestRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Rectangleinfo rectinfo=new Rectangleinfo();
		Rectangle1 rect=null;
		do
		{
		
		System.out.println("1-Create Rectangle\n2-Display\n3-Area\n4-Perimeter");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			rect=rectinfo.create();
			break;
		case 2:
			rectinfo.display(rect);
			break;
		case 3:
			rectinfo.area(rect);
			break;
		case 4:
			rectinfo.perimeter(rect);
			break;
			default :
				System.out.println("Invalid Credentials.............");
		}
		System.out.println("Do you want to continue (yes/no)");
		}while(sc.next().equals("yes"));
		System.out.println("---------------------------THANK YOU---------------------------");
	}
}
