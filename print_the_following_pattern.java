import java.util.*;
class Solution{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print((char)(64+n-i)+" ");
            }
            System.out.println();
        }
    }
}