import java.util.*;
class Even{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		System.out.println("Enter the element in an array");
		int arr[]=new int[n];
		
		for( int i=0;i<=n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<=n;i++)
		{
		if(i%2==0)
		{
			System.out.println("The Element present in "+ i+" even position is "+arr[i]);
		}
		}
		//System.out.println("The sum of even number is "+sum);
	}
}