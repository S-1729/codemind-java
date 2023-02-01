import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c>='0' && c<='9')
            {
                //int n=Integer.parseInt(String.valueOf(c));
                int n=c-'0';
                sum+=n;
            }
        }
        System.out.println(sum);
    }
}