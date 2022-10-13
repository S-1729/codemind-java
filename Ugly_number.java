import java.util.Scanner;
class Mai{
	public static void main(String args[]) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]={2,3,5};
		for(int i=0;i<arr.length;i++)
		{
		    while(n%arr[i]==0)
		    {
		        n/=arr[i];
		    }
		}
		if(n==1)
		System.out.print("Ugly Number");
		else
		System.out.print("Not Ugly Number");
	}
}