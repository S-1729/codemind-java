import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=scan.nextInt();
        
        int flag=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                c++;
            }
            if(c==1)
            {
            System.out.print(arr[i]+" ");
            flag=1;
            }
        }
        if(flag==0)
        System.out.println(-1);
    }
}