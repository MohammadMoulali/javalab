import java.util.Scanner;
class LeftRotate
{
	public static void main(String [] args)
	{
		int []a= new int[25];
		int i;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		System.out.println("enter  elements in array");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		Systeem.out.println("enter no of digits shifted");
		int shift=sc.nextInt();
		System.out.println("the elements before  shifting :");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

		for(i=0;i<shift;i++)
		{
			for(int j=0;j<size;j++)
			{
				int t=a[j];
				a[j]=a[j+1];
				a[size-1]=t;
			}
		}
		System.out.println("the elements after shifting :");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
				