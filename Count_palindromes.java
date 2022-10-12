import java.util.Scanner;
class sample{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            int temp=arr[i],rev=0;
            while(temp>0)
            {
                rev=rev*10+(temp%10);
                temp/=10;
            }
            if(arr[i]==rev)
                c++;
        }
        System.out.println(c);
    }
}