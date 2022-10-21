import java.util.*;
class Solution{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int  j=0;j<n;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            int max=arr[0][i];
            for(int  j=0;j<n;j++)
            {
                if(arr[j][i]>max)
                max=arr[j][i];
            }
            System.out.println(max);
        }
    }
}