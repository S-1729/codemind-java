import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int c1=0,c2=0;
        int a[]=new int[3];
        int b[]=new int[3];
        for(int i=0;i<3;i++)
        a[i]=scan.nextInt();
        for(int i=0;i<3;i++)
        b[i]=scan.nextInt();
        for(int i=0;i<3;i++)
        {
            if(a[i]>b[i])
            c1++;
            if(a[i]<b[i])
            c2++;
        }
        System.out.println(c1+" "+c2);
        
    }
}