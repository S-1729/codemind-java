import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String args[]) 
    {
        Scanner scan=new Scanner(System.in);
        int l=scan.nextInt();
        int t=scan.nextInt();
        for(int k=0;k<t;k++)
        {
            int a=scan.nextInt();
            int b=scan.nextInt();
            if(a>=l && b>=l)
            {
                if(a==b)
                {
                    System.out.println("ACCEPTED");
                }
                else
                {
                    System.out.println("CROP IT");
                }
            }
            else
            {
                System.out.println("UPLOAD ANOTHER");
            }
        }
    }
}