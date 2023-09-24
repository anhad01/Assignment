import java.util.*;
public class cap 
{
    public static void main (String args[])
    {
        int i,len;
        String str1,str2;
        char a[],b[];
        Boolean result;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the 1st string");
        str1= sc.nextLine();
        System.out.println("Enter the 2nd string");
        str2= sc.nextLine();
        str1=str1.replace(" ","");
        str2=str2.replace(" ","");
        str1=str1.toUpperCase();
        str2=str2.toUpperCase();
        a= str1.toCharArray();
        b= str2.toCharArray ();
        Arrays.sort(a);
        Arrays.sort(b);
        result = Arrays.equals(a,b);
        if(result==true)
        {
            System.out.println("Strings are Anagram");
        }
        else
        {
            System.out.println("Strings are not Anagram");
        }


    }    
}
