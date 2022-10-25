import java.util.Scanner;
class solution{
    public static void recursion(int arr[],int sum,int i)
    {
        if(i<arr.length)
        {
            sum+=arr[i];
            recursion(arr,sum,i+1);
        }
        else{
            System.out.print(sum);
        }
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=scan.nextInt();
        int sum=0,i=0;
        recursion(arr,sum,i);
    }
}