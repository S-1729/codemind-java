import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=scan.nextInt();
        
        int max=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                c++;
            }
            if(c==1 && arr[i]>max)
            {
            max=arr[i];
            }
        }
        if(max!=0)
        System.out.println(max);
        else
        System.out.println(-1);
    }
}