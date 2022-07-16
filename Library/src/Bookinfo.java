import java.util.Scanner;
public class Bookinfo {
	Scanner sc=new Scanner(System.in);
	public Book[] create() {
		System.out.println("How many books you want in array");
		int n=sc.nextInt();
		Book arr[]=new Book[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Name for Book "+(i+1));
			String bookName=sc.next();
			System.out.println("Enter price of the Book "+(i+1));
			double bookPrice=sc.nextDouble();
			Book bkarr=new Book(bookName,bookPrice);
			arr[i]=bkarr;
		}
		return arr;
	}
		public void display(Book bkarr[])
		{
			System.out.println("Book Title\t\t Price");
			for(int i=0;i<bkarr.length;i++)
			{
				System.out.println(bkarr[i].getBookTitle()+"\t\t"+bkarr[i].getBookPrice());
			}
		}	
		   public String search(String bkarr[],String search)
		   {
			   boolean b=false;
			   for(int i=0;i<bkarr.length;i++)
			   {
				   if(bkarr[i]==search)
				   {
					   b=true;
					   break;
				   }
			   }
			   if(b)
				{
					System.out.println("Book found");
				}
				else {
					System.out.println("Not Available");
				}
			   return search;
		   }
}