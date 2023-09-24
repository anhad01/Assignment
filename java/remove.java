import java.util.*;
public class remove 
{
    public static void main(String args[])
    {
        String str;
        int i,len;
        char ch;
        StringBuilder alp = new StringBuilder();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string");
        str =sc.nextLine();
        len=str.length();
        for(i=0;i<len;i++)
        {
            ch = str.charAt(i); 
            if(ch>='a'&& ch<='z'||ch>='A'&&ch<='Z')
            {
                alp.append(ch);
            }

        }
        System.out.println("After Removal = " +alp.toString());
    }
}    

