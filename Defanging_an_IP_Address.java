import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        String s="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='.')
            s+="[.]";
            else
            s+=str.charAt(i);
        }
        System.out.println(s);
    }
}