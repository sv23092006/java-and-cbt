import java.io.*;
public class palindrome
{
    public static void main(String[] args) {
        String s,s1,s2="";
        try
    {
    DataInputStream din = new 
    DataInputStream(System.in);
    System.out.println("Enter the input string:");
    s=din.readLine();
    int n =s.length();
    s1=s.toLowerCase();
    for(int i=n-1;i>=0;i--)
    s2=s2+s1.charAt(i);
    if(s1.equals(s2))
    System.out.println("The given string"+s+"is palindrome");
    else
    System.out.println("The given string"+s+"is not a palindrome");
    }
catch(IOException e)
{
    System.out.println(e);
}
}
}