import java.io.*;
class Rangeexception extends Exception
{
    Rangeexception(String e)
    {
        super(e);
    }
}
public class outrange
{
    public static void main(String args[])
    {
        int a=0,b=700,n;
        try
        {
            DataInputStream din=new DataInputStream(System.in);
            System.out.println("Enter any number:");
            n=Integer.parseInt(din.readLine());
            if(n <a ||n > b) throw new Rangeexception("Number out of range");
             System.out.println("The given number"+n+"is in the range of numbers"+a+"and"+b);
        }
        catch(Rangeexception s)
        {
             System.out.println(s);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
