import java.util.*;
public class rspace
{
    public static void main(String args[])
    {
        String str;
        int i,len;
        char ch;
        StringBuilder rs = new StringBuilder();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string");
        str =sc.nextLine();
        len=str.length();
        for(i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if(c != ' ' && c != '\t' && c != '\n' && c != '\r')
            {
                rs.append(ch);
            }
        }
        System.out.println(rs.toString());
    }    
}
