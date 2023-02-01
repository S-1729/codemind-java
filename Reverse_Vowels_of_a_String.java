import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        String s="",st="";
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c=='a'||c=='o'||c=='e'||c=='i'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            s+=c;
        }
        int n=s.length();
        int cnt=0;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c=='a'||c=='o'||c=='e'||c=='i'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
            st+=s.charAt(n-cnt-1);
            cnt++;
            }
            else
            st+=str.charAt(i);
        }
        System.out.println(st);
    }
}