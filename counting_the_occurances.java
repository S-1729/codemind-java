import java.util.Scanner;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        char c=scan.next().charAt(0);
        int cnt=0,flag=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==c)
            cnt++;
        }
        if(cnt==0)
        System.out.println(-1);
        else
        System.out.println(cnt);
        
    }
}