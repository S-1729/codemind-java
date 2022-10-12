import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		int c=0;
		for(int i=0;i<n;i++)
	    {
		        arr[i]=scan.nextInt();
		        if(arr[i]%2==1)
		        {
		            c++;
		        }
		}
		if(c<=2)
		System.out.println("YES");
		else
        System.out.println("NO");
	}
}