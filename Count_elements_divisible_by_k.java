import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int c=0;
		int k=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		        arr[i]=scan.nextInt();
		        if(arr[i]%k==0)
		        c++;
		}
		System.out.print(c);
	}
}