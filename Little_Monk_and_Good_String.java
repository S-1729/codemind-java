import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        int n=str.length();
        int max=0;
        for(int i=0;i<n;i++)
        {
            int cnt=0;
            for(int j=i;j<n;j++)
            {
                char c=str.charAt(j);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                cnt++;
                else
                break;
            }
            if(cnt>max)
            max=cnt;
        }
        System.out.println(max);
    }
}