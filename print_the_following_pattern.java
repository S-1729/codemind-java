import java.util.*;
class Solution{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-2;j++)
            {
                System.out.print(j);
            }
            for(int k=n-3;k>=1;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}