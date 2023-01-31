import java.util.Scanner;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        int cnt=0;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if((int)c>=65 && (int)c<=90)
            cnt++;
        }
        if(str.charAt(0)>='a' && str.charAt(0)<='z')
        System.out.println(cnt+1);
        else
        System.out.println(cnt);
    }
}