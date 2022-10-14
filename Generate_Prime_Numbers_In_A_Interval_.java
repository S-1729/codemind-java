import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String args[]) 
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(i==1 || i==0)
            {
                continue;
            }
            else
            {
                int c=0;
                int result=(int)Math.sqrt(i);
                for(int j=2;j<=result;j++)
                {
                    if(i%j==0)
                    {
                        c=1;
                        break;
                    }
                }
                if(c==0)
                {
                    System.out.println(i);
                }
            }
        }
    }
}