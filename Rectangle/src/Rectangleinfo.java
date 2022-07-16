import java.util.Scanner;
public class Rectangleinfo {
	Scanner sc=new Scanner(System.in);
	
	public Rectangle1 create() {
		System.out.println("Enter length for rectangle");
		float rectLength=sc.nextInt();
		System.out.println("Enter Breadth for rectangle");
		float rectBreadth=sc.nextInt();
		
		Rectangle1 rect=new Rectangle1(rectLength,rectBreadth);
		return rect;	
	}
	
	public float area(Rectangle1 rect) {
		float area=0;
			area=rect.getRectLength()*rect.getRectBreadth();
			System.out.println("Area of Rectangle of Length "+rect.getRectLength()+" and Breadth "+rect.getRectBreadth()+"is : "+area);
		return area;
	}
	
	public void display (Rectangle1 rect) {
		System.out.println("Length = "+rect.getRectLength()+"\tBreadth = "+rect.getRectBreadth());
	}
	
	public float perimeter(Rectangle1 rect) {
		float peri=0;
		peri=rect.getRectLength()+rect.getRectBreadth();
		System.out.println("Perimeter of Rectangle is : "+peri);
		return peri;
	}
}
