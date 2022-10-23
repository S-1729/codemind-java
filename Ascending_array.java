import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int flag=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>=arr[j])
                flag+=1;
                
            }
        }
        if(flag==0)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}