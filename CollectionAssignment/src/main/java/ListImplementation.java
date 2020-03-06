import java.util.*;
public class ListImplementation {
		public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		ListCustom<Object> ab=new ListCustom<Object>();
		while(true)
		{
			System.out.println("Select the options");
			System.out.println("1.add Element");
			System.out.println("2.Delete particular position");
			System.out.println("3.fetch data at position");
			System.out.println("4.print the whole list");
			System.out.println("5.break");
			
			int s=sc.nextInt();
			if(s==1)
			{
				int n=sc.nextInt();
					ab.add(n);
				
			}
			else if(s==2)
			{
				System.out.println("Enter the position ");
				int g=sc.nextInt();
				ab.remove(g);
				
			}
			else if (s==3)
			{
				System.out.println("Enter the position to fetch the data");
				int g1=sc.nextInt();
				Object y1=ab.get(g1);
				System.out.println(y1);
				
				
			}
			else if(s==4)
			{
				ab.displayList();
			}
			else
			{
				break;
			}
			
			
		}
	}
}
