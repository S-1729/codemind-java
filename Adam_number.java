import java.util.Scanner;
class AdamNumber
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sq1=n*n,rev1=0,rev2=0,sq2,rem;
        while(n>0)
        {
            rem=n%10;
            rev1=rev1*10+rem;
            n/=10;
        }
        sq2=rev1*rev1;
        while(sq2>0)
        {
            rem=sq2%10;
            rev2=rev2*10+rem;
            sq2/=10;
        }
        if(sq1==rev2)
        System.out.println("True");
        else
        System.out.println("False");
    }
}